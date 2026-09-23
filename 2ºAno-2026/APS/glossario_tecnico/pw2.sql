-- Banco de dados utilizado pelo projeto
CREATE DATABASE IF NOT EXISTS pw2
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

USE pw2;

-- Remove a tabela anterior do projeto escolar, se ela existir
DROP TABLE IF EXISTS termos;

-- Tabela principal do glossário
CREATE TABLE termos (
    id INT NOT NULL AUTO_INCREMENT,
    termo VARCHAR(100) NOT NULL,
    definicao TEXT NOT NULL,
    exemplo TEXT NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Exemplos iniciais para testar o sistema
INSERT INTO termos (termo, definicao, exemplo) VALUES
('API',
 'Conjunto de regras e recursos que permite que diferentes sistemas ou aplicações se comuniquem entre si.',
 'Um aplicativo pode usar uma API para consultar dados de um serviço externo.'),

('Banco de Dados',
 'Sistema organizado para armazenar, consultar e gerenciar informações de forma estruturada.',
 'Um site pode utilizar um banco de dados para guardar usuários, produtos e pedidos.'),

('Git',
 'Sistema de controle de versão utilizado para registrar alterações em arquivos e facilitar o trabalho colaborativo.',
 'Um desenvolvedor pode usar Git para criar uma nova branch antes de implementar uma funcionalidade.'),

('HTML',
 'Linguagem de marcação utilizada para estruturar o conteúdo de páginas da web.',
 'O HTML pode ser usado para criar títulos, parágrafos, links, tabelas e formulários.'),

('PHP',
 'Linguagem de programação muito utilizada para criar aplicações web que são executadas no servidor.',
 'Um arquivo PHP pode consultar um banco de dados e exibir os resultados em uma página web.');

-- Conferência dos registros
SELECT * FROM termos;
