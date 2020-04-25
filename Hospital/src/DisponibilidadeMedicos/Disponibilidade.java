/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisponibilidadeMedicos;

import View.TelaPrincipal;
import javax.swing.JOptionPane;

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
        
        if(combox.equalsIgnoreCase("clínico geral")){
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
    
     public void AnalisarVagasEMarcar(String combox){
        
        if(combox.equalsIgnoreCase("clínico geral")){
            this.ClinicoGeral = this.getClinicoGeral() -1;
            this.setMostrarVagas(String.valueOf(this.getClinicoGeral()));
            if(this.ClinicoGeral ==0){
                JOptionPane.showMessageDialog(null, "Sem vagas");
            }
        }else if(combox.equalsIgnoreCase("pediatra")){
            this.setMostrarVagas(String.valueOf(this.getPediatra()));
            this.Pediatra = this.Pediatra -1;
            if(this.Pediatra ==0){
                JOptionPane.showMessageDialog(null, "Sem vagas");
            }
        }else if(combox.equalsIgnoreCase("fisioterapeuta")){
            this.setMostrarVagas(String.valueOf(this.getFisioterapeuta()));
            this.Fisioterapeuta = this.Fisioterapeuta -1;
            if(this.Fisioterapeuta == 0){
                JOptionPane.showMessageDialog(null, "Sem vagas");
            }
        }else if(combox.equalsIgnoreCase("oftamologista")){
            this.setMostrarVagas(String.valueOf(this.getOftamologista()));
            this.Oftamologista = this.Oftamologista -1;
            if(this.Oftamologista ==0){
                JOptionPane.showMessageDialog(null, "Sem vagas");
            }
        }else if(combox.equalsIgnoreCase("cirurgião plástico")){
            this.setMostrarVagas(String.valueOf(this.getCirurgiaoPlastico()));
            this.CirurgiaoPlastico = this.CirurgiaoPlastico -1;
            if(this.CirurgiaoPlastico ==0){
                JOptionPane.showMessageDialog(null, "Sem vagas");
            }
            
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
