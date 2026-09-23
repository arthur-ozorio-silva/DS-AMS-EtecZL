<?php
require_once 'conexao.php';

// Obtém o ID pela URL
$id = filter_input(INPUT_GET, 'id', FILTER_VALIDATE_INT);

if (!$id) {
    header('Location: index.php');
    exit;
}

// Busca o termo atual
$stmt = $pdo->prepare("SELECT * FROM termos WHERE id = ?");
$stmt->execute([$id]);
$termoAtual = $stmt->fetch(PDO::FETCH_ASSOC);

// Se o termo não existir, volta para a página inicial
if (!$termoAtual) {
    header('Location: index.php');
    exit;
}

$erro = '';

// Processa a atualização
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $termo = trim($_POST['termo'] ?? '');
    $definicao = trim($_POST['definicao'] ?? '');
    $exemplo = trim($_POST['exemplo'] ?? '');

    if ($termo === '' || $definicao === '' || $exemplo === '') {
        $erro = 'Preencha todos os campos antes de atualizar.';
        $termoAtual['termo'] = $termo;
        $termoAtual['definicao'] = $definicao;
        $termoAtual['exemplo'] = $exemplo;
    } else {
        $sql = "UPDATE termos SET termo = ?, definicao = ?, exemplo = ? WHERE id = ?";
        $stmt = $pdo->prepare($sql);

        if ($stmt->execute([$termo, $definicao, $exemplo, $id])) {
            header('Location: index.php');
            exit;
        }
    }
}
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Termo - Glossário Técnico</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">
<div class="container py-5">
    <div class="card shadow-sm border-0 p-4 mx-auto" style="max-width: 750px;">
        <h2 class="mb-1">Editar termo</h2>
        <p class="text-secondary mb-4">
            Atualize as informações de <strong><?= htmlspecialchars($termoAtual['termo']) ?></strong>.
        </p>

        <?php if ($erro): ?>
            <div class="alert alert-danger">
                <?= htmlspecialchars($erro) ?>
            </div>
        <?php endif; ?>

        <form method="POST" action="">
            <div class="mb-3">
                <label for="termo" class="form-label fw-semibold">Termo técnico</label>
                <input
                    type="text"
                    id="termo"
                    name="termo"
                    class="form-control"
                    value="<?= htmlspecialchars($termoAtual['termo']) ?>"
                    required
                    maxlength="100"
                >
            </div>

            <div class="mb-3">
                <label for="definicao" class="form-label fw-semibold">Definição</label>
                <textarea
                    id="definicao"
                    name="definicao"
                    class="form-control"
                    rows="5"
                    required
                ><?= htmlspecialchars($termoAtual['definicao']) ?></textarea>
            </div>

            <div class="mb-4">
                <label for="exemplo" class="form-label fw-semibold">Exemplo</label>
                <textarea
                    id="exemplo"
                    name="exemplo"
                    class="form-control"
                    rows="4"
                    required
                ><?= htmlspecialchars($termoAtual['exemplo']) ?></textarea>
            </div>

            <button type="submit" class="btn btn-primary">
                Atualizar termo
            </button>

            <a href="index.php" class="btn btn-secondary">
                Cancelar
            </a>
        </form>
    </div>
</div>
</body>
</html>