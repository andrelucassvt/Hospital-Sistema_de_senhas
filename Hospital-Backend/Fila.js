class NoFila{
    constructor(valor, proximo){
        this.valor = valor;
        this.proximo = proximo;
    }
}

class Fila{
    constructor(){
        this.senhaAtual = 1;
        this.cabeça = null;
        this.calda = null;
    }

    add(modalidade){
        let novoNo = new NoFila(this.senhaAtual+modalidade, null);

        this.senhaAtual++;

        if(this.cabeça == null){
            this.cabeça = novoNo;
            this.calda = novoNo;
        } else {
            this.calda.proximo = novoNo;
            this.calda = novoNo;
        }

        return novoNo.valor;
    }

    remove(){
        let senhaRemovida = this.cabeça;
        if(this.cabeça == null){
            console.log("Fila Vazia");
            return "Fila Vazia";
        } else {
            this.cabeça = this.cabeça.proximo;
        }
        return senhaRemovida.valor;
    }

    ler(){
        let noAtual = this.cabeça;
        console.log("Lendo Fila")
        while(noAtual != null){
            console.log(noAtual.valor);
        }
    }

    esvaziar(){
        console.log("Evaziando");
        this.cabeça = null;
    }
}

module.exports = Fila;