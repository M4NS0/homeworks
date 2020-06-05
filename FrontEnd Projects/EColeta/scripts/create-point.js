

function populateUFs() {
    const ufSelect = document.querySelector("select[name=uf]")
    fetch("https://servicodados.ibge.gov.br/api/v1/localidades/estados")
    .then(res =>  res.json())
    .then( states => {
        
        for( const state of states ) {
            ufSelect.innerHTML += `<option value="${state.id}">${state.nome}</option>`
        }
    })  
}

populateUFs()


function getCities(event) {
    const citySelect = document.querySelector("select[name=city]")
    const stateInput = document.querySelector("input[name=state]")
    const ufValue = event.target.value
   
    const indexOfSelectedState = event.target.selectedIndex
    stateInput.value = event.target.options[indexOfSelectedState].text
    const url = `https://servicodados.ibge.gov.br/api/v1/localidades/estados/${ufValue}/municipios`
    
    citySelect.innerHTML = "<option value>Selecione a Cidade</option value>"
    citySelect.disabled = true

    fetch(url)
    .then(res =>  res.json())
    .then( cities => {

        for( const city of cities ) {
            citySelect.innerHTML += `<option value="${city.nome}">${city.nome}</option>`

        }
        citySelect.disabled = false
    })
}


document
    .querySelector("select[name=uf]")
    .addEventListener("change", getCities)

// Itens de Coleta

/* pegar todos os li's */
const itemsToCollect = document.querySelectorAll(".items-grid li")

for (const items of itemsToCollect) {
    items.addEventListener("click", handleSelectedItem)

}

const collectedItems = document.querySelector("input[name=items]")

/* let pode variar, const não varia */
let selectedItems = []

function handleSelectedItem (event) {
    const itemLi = event.target

    /* adicionar ou remover uma classe com JS */
    itemLi.classList.toggle("selected")

    /* quando o li é clicado, pega o 
    dataset referente a sua numeração.
    Verifica se existem itens selecionados 
    se sim pegar itens selecionados.*/

    const itemId = itemLi.dataset.id

        /* essa função (arrow) abaixo é recursiva com 
        os eventos acima, como um laço  de  repetição
        que vai encontrando  os  itens  e  retornando
        true ou false, se false, faz recursão
        
        compara valores com item e itemId  retornando true ou false            
        const itemFound = item == itemId
        
        return itemFound
            
        como foi usada a arrow func, foi
        comentada mas a lógica é a mesma 

        o return poderia ficar assim, depois:
        return item == itemFound 
        
        em forma reduzida: 
        const alreadySelected = selectedItems.findIndex(item => item == itemId)  
        */

        const alreadySelected = selectedItems.findIndex(item => {
            const itemFound = item == itemId
            return itemFound
        })
       
    

       /* se for -1 o resultado é falso 
       console.log(alreadySelected >= 0) */

       /* Se ja estiver selecionado, 
          retirar da seleção  */
       if(alreadySelected >= 0) {
           const filteredItems = selectedItems.filter(item => {
               const itemIsDifferent = item != itemId 
               return itemIsDifferent
           })
           //console.log(filteredItems)
           selectedItems = filteredItems
       
    
    /* Se não estiver selecionado,
       adicionar a seleção  */
    } else {
        selectedItems.push(itemId)
       

    }
    // console.log(selectedItems)

    /* atualizar o campo escondido 
       com os itens selecionados  */
    collectedItems.value = selectedItems
    
}