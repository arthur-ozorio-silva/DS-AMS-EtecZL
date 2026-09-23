<?php
require_once 'conexao.php';

// Verifica se um ID válido foi enviado pela URL
$id = filter_input(INPUT_GET, 'id', FILTER_VALIDATE_INT);

if ($id) {
    // Exclui somente o termo correspondente ao ID
    $sql = "DELETE FROM termos WHERE id = ?";
    $stmt = $pdo->prepare($sql);
    $stmt->execute([$id]);
}

// Volta para a lista de termos
header('Location: index.php');
exit;
?>