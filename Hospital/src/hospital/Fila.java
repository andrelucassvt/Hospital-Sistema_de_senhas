package hospital;

class NoFila{
	
	protected String modalidade;
	protected int numero;
	protected NoFila proximo;
	
	public NoFila(int numero, String modalidade) {
		if(numero > 0) this.numero = numero;
		else System.exit(1);
		
		this.modalidade = modalidade;
	}
		
	public String getNo(){
		return this.numero + this.modalidade;
	}
}

public class Fila {
	
	private NoFila cabeca;
	private NoFila calda;
	private int senhaAtual;
	
	Fila(){
		this.cabeca = null;
		this.calda = null;
		this.senhaAtual = 0;
	}
	
	public String adicionar(String modalidade){
		senhaAtual++;
		
		NoFila novoNo = new NoFila(senhaAtual, modalidade);
		
		if(this.cabeca == null) {
			this.cabeca = novoNo;
			this.calda = novoNo;
		} else {
			this.calda.proximo = novoNo;
			this.calda = novoNo;
		}
		
		return novoNo.getNo();
	}
	
	public String chamar() {
		String resposta;
		
        if(this.cabeca == null){
        	resposta = "Fila Vazia";
        } else {
        	resposta = this.cabeca.getNo();
        	this.cabeca = this.cabeca.proximo;
        }
        return resposta;
	}

}
