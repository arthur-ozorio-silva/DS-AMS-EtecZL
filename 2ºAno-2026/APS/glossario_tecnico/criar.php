<?php
require_once 'conexao.php';

// Valores iniciais para manter os campos preenchidos após um erro
$termo = '';
$definicao = '';
$exemplo = '';
$erro = '';

// Verifica se o formulário foi enviado
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $termo = trim($_POST['termo'] ?? '');
    $definicao = trim($_POST['definicao'] ?? '');
    $exemplo = trim($_POST['exemplo'] ?? '');

    // Validação básica
    if ($termo === '' || $definicao === '' || $exemplo === '') {
        $erro = 'Preencha todos os campos antes de salvar.';
    } else {
        // Insere o novo termo usando placeholders
        $sql = "INSERT INTO termos (termo, definicao, exemplo) VALUES (?, ?, ?)";
        $stmt = $pdo->prepare($sql);

        if ($stmt->execute([$termo, $definicao, $exemplo])) {
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
    <title>Novo Termo - Glossário Técnico</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">
<div class="container py-5">
    <div class="card shadow-sm border-0 p-4 mx-auto" style="max-width: 750px;">
        <h2 class="mb-1">Cadastrar novo termo</h2>
        <p class="text-secondary mb-4">
            Adicione um conceito técnico, sua definição e um exemplo.
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
                    placeholder="Ex.: API"
                    value="<?= htmlspecialchars($termo) ?>"
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
                    placeholder="Explique o significado do termo."
                    required
                ><?= htmlspecialchars($definicao) ?></textarea>
            </div>

            <div class="mb-4">
                <label for="exemplo" class="form-label fw-semibold">Exemplo</label>
                <textarea
                    id="exemplo"
                    name="exemplo"
                    class="form-control"
                    rows="4"
                    placeholder="Mostre uma situação prática em que o termo é utilizado."
                    required
                ><?= htmlspecialchars($exemplo) ?></textarea>
            </div>

            <button type="submit" class="btn btn-primary">
                Salvar termo
            </button>

            <a href="index.php" class="btn btn-secondary">
                Cancelar
            </a>
        </form>
    </div>
</div>
</body>
</html>