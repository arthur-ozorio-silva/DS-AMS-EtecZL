<?php
// Configurações do XAMPP
$host = 'localhost';
$dbname = 'pw2';
$user = 'root';
$pass = '';

try {
    // Cria a conexão com o MySQL usando PDO
    $pdo = new PDO(
        "mysql:host=$host;dbname=$dbname;charset=utf8mb4",
        $user,
        $pass
    );

    // Faz o PDO exibir exceções quando houver erro
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

} catch (PDOException $e) {
    die("Erro ao conectar com o banco de dados: " . $e->getMessage());
}
?>