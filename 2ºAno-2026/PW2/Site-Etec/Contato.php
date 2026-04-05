<?php

echo '
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Contato</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>
<body>
';

include("navbar.php");

echo '
<main>
    
    <div class="container mt-5">
    <h1>Contato</h1>
    <form action="Processa.php" method="POST">
    <input class="form-control mb-2" name="nome" placeholder="Nome">
    <input class="form-control mb-2" name="endereco" placeholder="Endereço">
    <input class="form-control mb-2" name="telefone" placeholder="Telefone">
    <input class="form-control mb-2" name="email" placeholder="Email">
    <textarea class="form-control mb-2" name="mensagem" placeholder="Mensagem" rows="4"></textarea>
    <button class="btn btn-danger">Enviar</button>
    </form>
    </div>
</main>
';

include("footer.php");

echo '
</body>
</html>
';
?>