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

     <script>

document.addEventListener("DOMContentLoaded", () => {

    const form = document.querySelector("form");

    const nome = document.querySelector("input[name=\"nome\"]");
const endereco = document.querySelector("input[name=\"endereco\"]");
const telefone = document.querySelector("input[name=\"telefone\"]");
const email = document.querySelector("input[name=\"email\"]");
const mensagem = document.querySelector("textarea[name=\"mensagem\"]");

    const MAX_CHARS = 500;


    /* ── Contador de caracteres ───────────────────────── */

    const contador = document.createElement("small");
    mensagem.after(contador);

    mensagem.addEventListener("input", () => {

        let tamanho = mensagem.value.length;

        contador.textContent = `${tamanho} / ${MAX_CHARS}`;

        if(tamanho > MAX_CHARS){
            mensagem.value = mensagem.value.substring(0, MAX_CHARS);
        }

    });



    /* ── Máscara telefone ─────────────────────────────── */

    telefone.addEventListener("input", () => {

        let valor = telefone.value.replace(/\D/g,"");

        if(valor.length > 11){
            valor = valor.substring(0,11);
        }

        if(valor.length > 10){
            valor = valor.replace(
                /^(\d{2})(\d{5})(\d{4})$/,
                "($1) $2-$3"
            );
        }
        else if(valor.length > 6){
            valor = valor.replace(
                /^(\d{2})(\d{4})(\d+)$/,
                "($1) $2-$3"
            );
        }
        else if(valor.length > 2){
            valor = valor.replace(
                /^(\d{2})(\d+)$/,
                "($1) $2"
            );
        }

        telefone.value = valor;

    });



    /* ── Regras de validação ─────────────────────────── */

    const regras = {

        nome: valor =>
            !valor.trim()
            ? "Nome obrigatório."
            : valor.trim().length < 3
            ? "Digite pelo menos 3 caracteres."
            : "",


        endereco: valor =>
            !valor.trim()
            ? "Endereço obrigatório."
            : "",


        telefone: valor =>
            !valor.trim()
            ? "Telefone obrigatório."
            : valor.replace(/\D/g,"").length < 10
            ? "Telefone inválido."
            : "",


        email: valor =>
            !valor.trim()
            ? "Email obrigatório."
            : !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(valor)
            ? "Email inválido."
            : "",


        mensagem: valor =>
            !valor.trim()
            ? "Mensagem obrigatória."
            : valor.trim().length < 10
            ? "Mensagem muito curta."
            : ""

    };



    /* ── Estado visual dos campos ─────────────────────── */

    function validarCampo(campo, mensagemErro){

        campo.classList.toggle(
            "is-invalid",
            mensagemErro !== ""
        );

        campo.classList.toggle(
            "is-valid",
            mensagemErro === ""
        );

        return mensagemErro === "";

    }



    /* ── Validação ao sair do campo ───────────────────── */

    [nome,endereco,telefone,email,mensagem].forEach(campo => {

        campo.addEventListener("blur",()=>{

            let regra = regras[campo.name];

            if(regra){

                validarCampo(
                    campo,
                    regra(campo.value)
                );

            }

        });

    });



    /* ── Validação no envio ───────────────────────────── */

    form.addEventListener("submit",(evento)=>{


        let valido = true;


        [nome,endereco,telefone,email,mensagem].forEach(campo=>{

            let erro = regras[campo.name](campo.value);

            if(!validarCampo(campo,erro)){
                valido = false;
            }

        });



        if(!valido){

            evento.preventDefault();

            alert("Corrija os campos destacados antes de enviar.");

        }
        else{

            alert("Mensagem enviada com sucesso!");

        }


    });


});

</script>
</main>
';

include("footer.php");

echo "
</body>
</html>
";
?>