let frm = document.querySelector("form")
let resp = document.querySelector("pre")

frm.addEventListener("submit", (e) => {
    e.preventDefault()
    let nome = frm.inAtleta.value
    let idade = parseInt(frm.inIdade.value)

    let sublinhado = gerarSublinhado(nome)
    let categoria = gerarCategoria(idade)

    resp.innerText = nome + "\n" + sublinhado +"\nCategoria: " + categoria
    //resp.innerText = "${nome}\n ${sublinhado}\n Categoria: ${categoria}"
})

let gerarSublinhado = (nome) => {
    let aux = ""
    for (const n of nome) {
        if (n != "") {
            aux += "-"
        }
        else {
            aux += " "
        }
    }
    return aux
}

const gerarCategoria = (idade) => {
    if (idade <= 12) {
        categoria = "Infantil"
    }
    else if (idade > 12 && idade <= 20) {
        categoria = "Juvenil"
    }
    else if (idade > 20) {
        categoria = "Adulto"
    }
    return categoria
}