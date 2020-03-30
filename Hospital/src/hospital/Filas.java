/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author andre
 */
public class Filas {
    //Atributos
    private int senhaAtual;
    private int senhaAtualPreferencial;
    private final String ANormal = "AN";
    private final String FPreferencial = "AP";

    //Construtor
    public Filas() {
        this.senhaAtual = 0;
        this.senhaAtualPreferencial =0;
    }
    
    
    
    //Criando filas
    Queue<String> filaNormal = new LinkedList<>();
    Queue<String> filaPreferencial = new LinkedList<>();
    
    //Codigo
    
    public int adicionarNormal(){
        
        this.senhaAtual++;
        filaNormal.add(this.ANormal + this.senhaAtual);
        
        return this.senhaAtual;
        
    }
    
    public int adicionarPreferencia(){
        this.senhaAtualPreferencial++;
        filaPreferencial.add(this.FPreferencial + this.senhaAtualPreferencial);
        
        return this.senhaAtualPreferencial;
    }
    
    
}
