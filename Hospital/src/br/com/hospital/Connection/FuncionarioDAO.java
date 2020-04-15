/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospital.Connection;

import br.com.hospital.model.Cadfuncionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class FuncionarioDAO {
    
    
    public Cadfuncionario salvar(Cadfuncionario funcionario){
        EntityManager am = new ConnectionFactory().getConnection();
        
        try{
            am.getTransaction().begin();
            am.persist(funcionario);
            am.getTransaction().commit();
        
            JOptionPane.showMessageDialog(null, "Dados adicionados");
        }catch(Exception e){
              am.getTransaction().rollback();
              JOptionPane.showMessageDialog(null, "Erro de conexão","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            am.close();
        }
        
        return funcionario;
       
    }
    
    public List<Cadfuncionario> getTodosFuncionariosDAO(){
        EntityManager am = new ConnectionFactory().getConnection();
         
        List<Cadfuncionario> listaFuncionarios = null;
        
        try{
                
            listaFuncionarios = am.createQuery("from Cadfuncionario c").getResultList();
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            am.close();
        }
        return listaFuncionarios;
        
    }
    
}
