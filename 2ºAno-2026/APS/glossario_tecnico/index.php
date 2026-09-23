<?php
require_once 'conexao.php';

// Busca todos os termos cadastrados, do mais recente para o mais antigo
$stmt = $pdo->query("SELECT * FROM termos ORDER BY id DESC");
$termos = $stmt->fetchAll(PDO::FETCH_ASSOC);
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Glossário Técnico</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #eef4ff, #f8f9fa);
            min-height: 100vh;
        }

        .header-glossario {
            background: #172554;
            color: white;
            border-radius: 16px;
            padding: 32px;
            box-shadow: 0 8px 24px rgba(0,0,0,.12);
        }

        .header-glossario h1 {
            margin-bottom: 8px;
        }

        .termo-card {
            height: 100%;
            border: 0;
            border-radius: 14px;
            box-shadow: 0 4px 14px rgba(0,0,0,.08);
            transition: transform .2s ease, box-shadow .2s ease;
        }

        .termo-card:hover {
            transform: translateY(-4px);
            box-shadow: 0 8px 22px rgba(0,0,0,.12);
        }

        .termo-titulo {
            color: #1d4ed8;
            font-weight: 700;
        }

        .rotulo {
            font-size: .82rem;
            font-weight: 700;
            text-transform: uppercase;
            color: #64748b;
            letter-spacing: .04em;
        }

        .exemplo {
            background: #f8fafc;
            border-left: 4px solid #1d4ed8;
            padding: 12px 14px;
            border-radius: 6px;
        }
    </style>
</head>

<body>
<div class="container py-5">

    <div class="header-glossario mb-4">
        <div class="d-flex flex-column flex-md-row justify-content-between align-items-md-center gap-3">
            <div>
                <h1>Glossário de Termos Técnicos</h1>
                <p class="mb-0">Consulte conceitos de tecnologia com definições e exemplos práticos.</p>
            </div>

            <a href="criar.php" class="btn btn-light fw-semibold">
                + Novo termo
            </a>
        </div>
    </div>

    <?php if (count($termos) > 0): ?>
        <div class="row g-4">
            <?php foreach ($termos as $termo): ?>
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="card termo-card p-4">
                        <div class="card-body">
                            <div class="rotulo mb-1">Termo</div>
                            <h3 class="termo-titulo mb-3">
                                <?= htmlspecialchars($termo['termo']) ?>
                            </h3>

                            <div class="rotulo">Definição</div>
                            <p class="mb-3">
                                <?= nl2br(htmlspecialchars($termo['definicao'])) ?>
                            </p>

                            <div class="rotulo">Exemplo</div>
                            <div class="exemplo mb-4">
                                <?= nl2br(htmlspecialchars($termo['exemplo'])) ?>
                            </div>

                            <div class="d-flex gap-2">
                                <a
                                    href="editar.php?id=<?= (int)$termo['id'] ?>"
                                    class="btn btn-primary btn-sm"
                                >
                                    Editar
                                </a>

                                <button
                                    onclick="confirmarExclusao(<?= (int)$termo['id'] ?>)"
                                    class="btn btn-outline-danger btn-sm"
                                >
                                    Excluir
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            <?php endforeach; ?>
        </div>
    <?php else: ?>
        <div class="alert alert-info shadow-sm">
            Nenhum termo foi cadastrado ainda. Clique em <strong>+ Novo termo</strong> para começar.
        </div>
    <?php endif; ?>

</div>

<script>
function confirmarExclusao(id) {
    if (confirm("Tem certeza que deseja excluir este termo? Esta ação não pode ser desfeita.")) {
        window.location.href = "excluir.php?id=" + id;
    }
}
</script>

</body>
</html>