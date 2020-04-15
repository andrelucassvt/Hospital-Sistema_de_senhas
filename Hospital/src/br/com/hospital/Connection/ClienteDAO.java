/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospital.Connection;

import br.com.hospital.model.Cadcliente;
import hospital.TelaPrincipal;
import java.awt.Color;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ClienteDAO {
    
private String validacaoDAO;

    public Cadcliente salvar(Cadcliente cliente){
        EntityManager am = new ConnectionFactory().getConnection();
        
        try{
            am.getTransaction().begin();
            am.persist(cliente);
            am.getTransaction().commit();
        
            JOptionPane.showMessageDialog(null, "Dados adicionados");
            
        }catch(Exception e){
             am.getTransaction().rollback();
             JOptionPane.showMessageDialog(null, "Erro de conexão","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            am.close();
        }
        
        return cliente;
    }
    
    
    public Cadcliente ChamarPorCpf(String cpf){  
       EntityManager am = new ConnectionFactory().getConnection();  
       Cadcliente cliente = null;
       TelaPrincipal telaPrincipal = new TelaPrincipal();
        try {
            
           cliente = am.find(Cadcliente.class, cpf);
           
        } catch (Exception e){
            
            e.getStackTrace();
            System.out.println(e.getMessage());
            
        }finally{
            if(cliente != null){
                 this.setValidacaoDAO("Cliente cadastrado");
            }else{
                this.setValidacaoDAO("Cliente não cadastrado");
            }
            am.close();
        }
        
        
        return cliente;
    }

    public String getValidacaoDAO() {
        return validacaoDAO;
    }

    public void setValidacaoDAO(String validacaoDAO) {
        this.validacaoDAO = validacaoDAO;
    }
    

    
    
    
}
