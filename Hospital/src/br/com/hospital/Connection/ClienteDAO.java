/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospital.Connection;

import br.com.hospital.model.Cadcliente;
import View.TelaPrincipal;
import java.awt.Color;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ClienteDAO {
//Variavél que armazena o resultado se o cliente está ou não cadastrado
//Para mostrar na tela principal
private String validacaoDAO;

    public Cadcliente getSalvar(Cadcliente cliente){
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
    
    //Chamar por chave primaria
    public Cadcliente getBuscar(String cpf){  
       EntityManager am = new ConnectionFactory().getConnection();  
       Cadcliente cliente = null;
       TelaPrincipal telaPrincipal = new TelaPrincipal();
        try {
            
           cliente = am.find(Cadcliente.class, cpf);
           
        } catch (Exception e){
            
             am.getTransaction().rollback();
             JOptionPane.showMessageDialog(null, "Erro de conexão","ERRO", JOptionPane.ERROR_MESSAGE);
            
        }finally{
            if(cliente != null){
                this.setValidacaoDAO("Cadastrado");
                am.close();
            }else{
                this.setValidacaoDAO("NaoCad");
                am.close();
            }
        }
        return cliente;
    }
    
    
    public void getAtualizarRegistro(String cpf){
        
        EntityManager am = new ConnectionFactory().getConnection();
        
        try {
            Cadcliente cliente = am.find(Cadcliente.class,cpf);
            //Aqui você colocar oque que atualizar
            
            //Fim
            am.getTransaction().begin();
            am.merge(cliente);
            am.getTransaction().commit();
            
        } catch (Exception e) {
            am.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro de conexão","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            am.close();
        }
        
    }
    
    
    public void getRemoverRegistro(String cpf){
        
        EntityManager am = new ConnectionFactory().getConnection();
        
        try {
            Cadcliente cliente = am.find(Cadcliente.class, cpf);
            
            am.getTransaction().begin();
            am.remove(cliente);
            am.getTransaction().commit();
            
            
        } catch (Exception e){
             am.getTransaction().rollback();
             JOptionPane.showMessageDialog(null, "Erro de conexão","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            am.close();
        }
        
        
    }
    public String getValidacaoDAO() {
        return validacaoDAO;
    }

    public void setValidacaoDAO(String validacaoDAO) {
        this.validacaoDAO = validacaoDAO;
    }
    

    public List<Cadcliente>getTodosClientes(){
     EntityManager am = new ConnectionFactory().getConnection();
     
     List<Cadcliente> listaClientes = null;
     
        try {
            
            listaClientes = am.createQuery("from Cadcliente c").getResultList();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            am.close();
        }
        
        return listaClientes;
        
    }
    
    
}
