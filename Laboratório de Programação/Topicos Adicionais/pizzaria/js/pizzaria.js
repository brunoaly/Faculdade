let frm = document.querySelector("form")
let resp = document.querySelector("pre")
let itens = []

frm.rbPizza.addEventListener("click", () => {
    frm.inPizza.className = "exibe"
    frm.inBebida.className = "oculta"
})

frm.rbBebida.addEventListener("click", () => {
    frm.inPizza.className = "oculta"
    frm.inBebida.className = "exibe"
})

frm.inDetalhes.addEventListener("focus", () => {
    if (frm.rbPizza.checked) {
        let pizza = frm.inPizza.value
        let num
        switch (pizza) {
            case "media":
                num = 2
                break
            case "grande":
                num = 3
                break
            default:
                num = 4
        }
        frm.inDetalhes.placeholder = "Até " + num + " sabores"
    }
})

frm.inDetalhes.addEventListener("blur", () => {
    frm.inDetalhes.placeholder = ""
})

frm.addEventListener("submit", (e) => {
    e.preventDefault()
    
    frm.reset()
    frm.rbPizza.dispatchEvent(new Event("click"))
})