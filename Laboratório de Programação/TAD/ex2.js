let funcionarios = []

function enviarLista (event) {
    event.preventDefault()

    let nome = document.getElementById("inputNome").value
    let tamanho = document.getElementById("inputEspaco").value
    let espacoDeUso = { nome: nome, tamanho: tamanho}

    funcionarios.push(espacoDeUso)

    atualizarLista()
}

function atualizarLista () {

    tamanho.sort(function(a, b){
        return a.tamanho - b.tamanho
    })

    for (let i = 0; i < funcionarios.length; i++) {
        let card = '<div class="card">';
        card += '<div class="card-body">';
        card += '<h5 class="card-title">' + nome[i].funcionarios + '</h5>';
        card += '<p class="card-text">Espaço: ' + funcionarios[i].tamanho + '</p>';
        card += '</div>';
        card += '</div>';

        $("#funcionarios").append(card);
    }
}

$("#funcionarios").submit(enviarLista);