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
<main>
  
  <div class="container mt-5">
  
  <h1 class="text-center mb-4">Gestão Escolar</h1>
  
  <div class="card shadow p-4">
  
  <h4>Direção</h4>
  <p>A Direção Escolar é o departamento executivo encarregado da organizar as atividades administrativas e pedagógicas da Etec. Suas <br>
   atribuições, indicação e designação, são realizadas de acordo com o Capítulo IV, Seção I do Regimento Comum das Etecs (Deliberação <br>
    CEETEPS nº 87, de 08 de dezembro de 2022).</p>
  
  <hr>
  
  <h4>Coordenação de Cursos</h4>
  <p>As Coordenações de Curso são responsáveis pelo conjunto de ações destinadas ao planejamento do ensino, à supervisão de sua execução, ao <br>
   controle das atividades docentes em relação às diretrizes didáticas pedagógicas e administrativas, bem como pela otimização dos recursos <br>
    físicos e didáticos disponíveis para os cursos mantidos pelas Etecs.
  
  </p>
  
  <hr>
  
  <h4>Secretaria Acadêmica</h4>
  <p>Horários de Atendimentos <br>
  Segunda-Feira a Sexta-Feira <br>
  12h00min. às 13h00min. <br>
  18h00min. às 19h30min.</p>
  
  </div>
  
  </div>
</main>
';

include("footer.php");

echo '

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
';
?>