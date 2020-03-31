const { Router } = require('express');
const Fila = require('./Fila');

const routes = Router();

let filaNormal = new Fila();
let filaPrioridade = new Fila();

routes.get('/adicionar/:modalidade', (request, response) => {
    const modalidade  = request.params.modalidade;
    console.log("Adicionando " + modalidade);

    let senha = null;

    if(modalidade ==  'prioridade'){
        senha = filaPrioridade.add();
    } else {
        senha = filaNormal.add();
    }

    response.json( senha );
});

routes.get('/chamar/:modalidade', (request, response) => {
    const modalidade = request.params.modalidade;
    console.log("Removendo " + modalidade);
    
    let senhaChamada = null;

    if(modalidade ==  'prioridade'){
        senhaChamada = filaPrioridade.remove();
    } else {
        senhaChamada = filaNormal.remove();
    }

    response.json( senhaChamada );
});


module.exports = routes;