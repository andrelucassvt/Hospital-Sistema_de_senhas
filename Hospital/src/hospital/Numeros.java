/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author andre
 */
public class Numeros {
 
    //Atributos
    private int num;
    private int tamanho = 5;
    private int auxilarArmazenamento = 0;
    public int armazenar [] = new int[this.tamanho];
    
    //Construtor
    Numeros(){
        this.num = 0;
    }
    
    //Metodos
    public void gerarSenhaNormal(int aumento){
        this.num = aumento;
        
        if(this.getNum() >0){
            this.armazenar[auxilarArmazenamento] = this.getNum();
            this.tamanho++;
            this.auxilarArmazenamento++;
            
        }
       
    }
    
    
   
    
    
    //Gett and Sett
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

   
   

    
   
    
}
