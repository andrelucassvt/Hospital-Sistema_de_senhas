const { Router } = require('express');
const Fila = require('./Fila');

const routes = Router();

let filaNormal = new Fila();
let filaPrioridade = new Fila();

routes.get('/adicionar/:modalidade', (request, response) => {
    const modalidade  = request.params.modalidade;
    console.log("Adicionando " + modalidade);

    let senha = null;

    if(modalidade ==  'AP'){
        senha = filaPrioridade.add(modalidade);
    } else {
        senha = filaNormal.add(modalidade);
    }

    response.json( senha );
});

routes.get('/chamar/:modalidade', (request, response) => {
    const modalidade = request.params.modalidade;
    console.log("Removendo " + modalidade);
    
    let senhaChamada = null;

    if(modalidade ==  'AP'){
        senhaChamada = filaPrioridade.remove();
    } else {
        senhaChamada = filaNormal.remove();
    }

    response.json( senhaChamada );
});


module.exports = routes;