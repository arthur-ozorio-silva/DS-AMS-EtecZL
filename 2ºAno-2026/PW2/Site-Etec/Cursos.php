<?php

echo '
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cursos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>
<body>
';

include("navbar.php");

echo '
<main>
    
    <div class="container mt-5">
    
    <h1 class="text-center mb-4">Nossos Cursos</h1>
    
    <div class="row">
    
    <div class="col-md-6">
    <div class="card shadow p-3">
        <img src="img\DS.jpg" alt="DS">
    <h3>Desenvolvimento de Sistemas</h3>
    <p>O curso técnico de nível médio em Desenvolvimento de Sistemas oferecido pela Etec Zona Leste tem como principal objetivo formar <br> profissionais técnicos em desenvolvimento de sistemas capacitados para desenvolver, testar, implementar e manter sistemas <br> computacionais, tanto para software, plataformas web e para dispositivos móveis.
    Durante o curso, os alunos aprendem conteúdos teóricos e práticos relacionados à programação, análise de sistemas, banco de <br> dados, redes, segurança da informação e desenvolvimento de software. As linguagens de programação mais utilizadas no <br> mercado, como Java, HTML, CSS, JavaScript, SQL e PHP, também são abordadas nas aulas.
    Além disso, os estudantes aprendem a trabalhar em equipe, resolver problemas do mundo real e aplicar metodologias ágeis, no <br> desenvolvimento de projetos. No curso também o estudante participará de projetos de sistemas onde ele poderá <br> apresentar em feiras, workshops e exposições no estado de São Paulo. Ao final do curso, é geralmente realizado um Trabalho de <br> Conclusão de Curso (TCC), onde os alunos colocam em prática todo o conhecimento adquirido, desenvolvendo um sistema completo</p>
    </div>
    </div>
    
    <div class="col-md-6">
    <div class="card shadow p-3">
    <img src="img\ADM.png" alt="ADM">
    <h3>Administração</h3>
    <p>O aluno vai aprender ainda a analisar as chances de um negócio ou produto ser bem-sucedido e o comportamento do <br> consumidor. Estudará também técnicas de atendimento ao cliente, empreendedorismo (iniciativas para realizar novos negócios) e como <br> uma organização planeja alcançar seus objetivos e define suas metas para o futuro.</p>
    </div>
    </div>
    
    <div class="col-md-6 mt-3">
    <div class="card shadow p-3">
        <img src="img\LOG.jpg" alt="LOG">
    <h3>Logística</h3>
    <p>No contexto do aprendizado sobre logística, os estudantes serão expostos a uma variedade de conhecimentos <br> interdisciplinares, incluindo matemática, geografia e física. Essas disciplinas são fundamentais para entender os processos de compra de <br> matérias-primas, a movimentação de estoque e a escolha das melhores rotas de transporte.
    Ao longo do curso, os alunos aprenderão a otimizar a movimentação das cargas e produtos dentro de um estoque, considerando fatores como <br> a utilização de equipamentos adequados, como carrinhos ou empilhadeiras, e o armazenamento correto de diferentes tipos de produto.
    Além disso, eles serão introduzidos aos diferentes modais de transporte disponíveis, como caminhões, embarcações, trens e aviões, e <br> aprenderão a selecionar o transporte mais adequado para cada tipo de produto e cliente. Isso inclui entender as características de cada moral, custos envolvidos e as principais rotas disponíveis.
    O estudo da logística também abrangerá questões relacionadas à embalagem dos produtos, organização da carga para o transporte e cálculo dos <br> custos envolvidos em cada etapa do processo.</p>
    </div>
    </div>
    
    </div>
    
    </div>
</main>
';

include("footer.php");

echo '
</body>
</html>
';
?>