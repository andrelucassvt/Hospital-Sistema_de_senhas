/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospital.Connection;

import br.com.hospital.model.Cadfuncionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author andre
 */
public class FuncionarioDAO {
    
    
    public Cadfuncionario getSalvar(Cadfuncionario funcionario){
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
      
      List<Cadfuncionario> lista = null;
      
        try {
            
            lista = am.createQuery("from Cadfuncionario f").getResultList();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            am.close();
        }
        return lista;
    }
    
}
