<?php
echo '
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ETEC Zona Leste</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>

<body>

    
    <!-- NAVBAR -->
    ';
    include("navbar.php");
    
    echo '
    <main>
    <!-- BEM VINDO -->
    <div class="container-fluid bg-light text-center p-5">
    
    <img src="img/LOGO-SP.png" width="120">
    <img src="img/logo_cps.png" width="120">
    
    <h1 class="mt-4">Bem-vindo à ETEC Zona Leste</h1>
    <p>Formando profissionais para o futuro </p>
    
    </div>
    
    
    <!-- CARROSSEL -->
    <div class="container mt-4">
    
    <div id="carouselExample" class="carousel slide" data-bs-ride="carousel">
    
    <div class="carousel-inner rounded shadow">
    
    <div class="carousel-item active">
    <img src="img/Etec(1).jpg" class="d-block w-100">
    </div>
    
    <div class="carousel-item">
    <img src="img/Etec(2).jpg" class="d-block w-100">
    </div>
    
    <div class="carousel-item">
    <img src="img/Etec(3).jpg" class="d-block w-100">
    </div>
    
    <div class="carousel-item">
    <img src="img/Etec(4).jpg" class="d-block w-100">
    </div>
    
    </div>
    
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
    <span class="carousel-control-prev-icon"></span>
    </button>
    
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
    <span class="carousel-control-next-icon"></span>
    </button>
    
    </div>
    
    </div>
    
    <!-- CURSOS -->
    <div class="container mt-5">
    
    <h2 class="text-center mb-4">Cursos Técnicos</h2>
    
    <div class="row">
    
    <!-- CARD 1 -->
    <div class="col-md-4">
    <div class="card shadow card-expand">
    
    <div class="card-body text-center">
    
    <h4>Desenvolvimento de Sistemas</h4>
    <p>Aprenda programação e web.</p>
    
    <button class="btn btn-danger" data-bs-toggle="collapse" data-bs-target="#ds">
    Saiba mais
    </button>
    
    <div class="collapse mt-3" id="ds">
    <p>
    Curso voltado para criação de sistemas, sites,
    banco de dados, lógica de programação e mobile.
    </p>
    </div>
    
    </div>
    </div>
    </div>
    
    <!-- CARD 2 -->
    <div class="col-md-4">
    <div class="card shadow card-expand">
    
    <div class="card-body text-center">
    
    <h4>Administração</h4>
    <p>Gestão e empreendedorismo.</p>
    
    <button class="btn btn-danger" data-bs-toggle="collapse" data-bs-target="#adm">
    Saiba mais
    </button>
    
    <div class="collapse mt-3" id="adm">
    <p>
    Aprende marketing, RH, finanças e organização empresarial.
    </p>
    </div>
    
    </div>
    </div>
    </div>
    
    <!-- CARD 3 -->
    <div class="col-md-4">
    <div class="card shadow card-expand">
    
    <div class="card-body text-center">
    
    <h4>Logística</h4>
    <p>Distribuição e planejamento.</p>
    
    <button class="btn btn-danger" data-bs-toggle="collapse" data-bs-target="#log">
    Saiba mais
    </button>
    
    <div class="collapse mt-3" id="log">
    <p>
    Controle de estoque, transporte, cadeia de suprimentos
    e planejamento logístico.
    </p>
    </div>
    
    </div>
    </div>
    </div>
    
    </div>
    </div>
</main>

<!-- RODAPÉ -->
';

include("footer.php");

echo '

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
';
?>