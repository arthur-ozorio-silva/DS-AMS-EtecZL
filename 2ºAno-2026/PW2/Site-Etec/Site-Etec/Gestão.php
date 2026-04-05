<?php
echo '
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Gestão - ETEC ZL</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>

<body>
';

include("navbar.php");

echo '

<div class="container mt-5">

<h1 class="text-center mb-4">Gestão Escolar</h1>

<div class="card shadow p-4">

<h4>Direção</h4>
<p>Responsável pela administração geral da unidade.</p>

<hr>

<h4>Coordenação</h4>
<p>Organização pedagógica dos cursos técnicos.</p>

<hr>

<h4>Secretaria Acadêmica</h4>
<p>Atendimento ao aluno e documentação escolar.</p>

</div>

</div>
';

include("footer.php");

echo '

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
';
?>