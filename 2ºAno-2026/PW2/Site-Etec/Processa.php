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

$nome = $_POST['nome'];
$email = $_POST['email'];

echo 
"
<main>
  
  <div class='container text-center'>
    <div class='row align-items-start'>
      <div class='col'>
        <div class='card'>
          <div class='card-header'>
          </div>
          <div class='card-body'>
            <figure>
              <blockquote class='blockquote'>
                <p>Obrigado $nome, por entrar em contato. Enviaremos uma mensagem para seu e-mail: $email.</p>
              </blockquote>
              <figcaption class='blockquote-footer'>
              </figcaption>
            </figure>
          </div>
        </div>
      </div>
    </div>
  </div>
</main>
";

include("footer.php");

echo '
</body>
</html>
';
?>