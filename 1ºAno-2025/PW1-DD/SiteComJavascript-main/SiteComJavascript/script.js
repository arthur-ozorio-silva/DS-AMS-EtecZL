//Calculadora de idade
function calcularIdade() {
      const data_nascimento = document.getElementById("data_nascimento").value;

      if (!data_nascimento) {
        document.getElementById("idade").textContent =
          "Por favor, insira uma data de nascimento.";
        return;
      }
      const dataInformada = new Date(data_nascimento);
      const hoje = new Date();
      let idade = hoje.getFullYear() - dataInformada.getFullYear();
      const mesAtual = hoje.getMonth();
      const mesData = dataInformada.getMonth();
      if (
        mesAtual < mesData ||
        (mesAtual === mesData && hoje.getDate() < dataInformada.getDate())
      ) {
        idade--;
      }
      document.getElementById("idade").textContent =
        "Você tem " + idade + " ano(s).";
    }
    //Verificador de número par ou ímpar
function verificarParImpar() {
      const numero = parseInt(document.getElementById("numero").value);
    if (numero%2==0) {
      document.getElementById("resposta").textContent =
        "O número informado é par.";
    } else {
      document.getElementById("resposta").textContent =
        "O número informado é impar.";
    }}