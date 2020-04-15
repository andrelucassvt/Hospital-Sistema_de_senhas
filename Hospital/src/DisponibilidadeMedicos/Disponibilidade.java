/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisponibilidadeMedicos;

import hospital.TelaPrincipal;

/**
 *
 * @author andre
 */
public class Disponibilidade {
    
    private int ClinicoGeral;
    private int Pediatra;
    private int Fisioterapeuta;
    private int Oftamologista;
    private int CirurgiaoPlastico;
    
    private String MostrarVagas;
    
    public Disponibilidade(){
        this.ClinicoGeral = 10;
        this.Pediatra = 10;
        this.Fisioterapeuta = 10;
        this.Oftamologista = 10;
        this.CirurgiaoPlastico = 5;
    }

    
    
    public void AnalisarVagas(String combox){
        
        if(combox.equalsIgnoreCase("clinico geral")){
            this.setMostrarVagas(String.valueOf(this.getClinicoGeral()));
            
        }else if(combox.equalsIgnoreCase("pediatra")){
            this.setMostrarVagas(String.valueOf(this.getPediatra()));
            
        }else if(combox.equalsIgnoreCase("fisioterapeuta")){
            this.setMostrarVagas(String.valueOf(this.getFisioterapeuta()));
            
        }else if(combox.equalsIgnoreCase("oftamologista")){
            this.setMostrarVagas(String.valueOf(this.getOftamologista()));
            
        }else if(combox.equalsIgnoreCase("cirurgião plástico")){
            this.setMostrarVagas(String.valueOf(this.getCirurgiaoPlastico()));
        } 
        
        
        
    }

    public String getMostrarVagas() {
        return MostrarVagas;
    }

    public void setMostrarVagas(String MostrarVagas) {
        this.MostrarVagas = MostrarVagas;
    }    
    public int getClinicoGeral() {
        return ClinicoGeral;
    }

    public void setClinicoGeral(int ClinicoGeral) {
        this.ClinicoGeral = ClinicoGeral;
    }

    public int getPediatra() {
        return Pediatra;
    }

    public void setPediatra(int Pediatra) {
        this.Pediatra = Pediatra;
    }

    public int getFisioterapeuta() {
        return Fisioterapeuta;
    }

    public void setFisioterapeuta(int Fisioterapeuta) {
        this.Fisioterapeuta = Fisioterapeuta;
    }

    public int getOftamologista() {
        return Oftamologista;
    }

    public void setOftamologista(int Oftamologista) {
        this.Oftamologista = Oftamologista;
    }

    public int getCirurgiaoPlastico() {
        return CirurgiaoPlastico;
    }

    public void setCirurgiaoPlastico(int CirurgiaoPlastico) {
        this.CirurgiaoPlastico = CirurgiaoPlastico;
    }
    
    
    
    
    
    
    
}
