/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospital.Connection;

import br.com.hospital.model.Cadcliente;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ClienteDAO {
    
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
    
}
