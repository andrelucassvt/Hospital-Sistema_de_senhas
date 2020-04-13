/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospital.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class ConnectionFactory {
    
    
    private static EntityManagerFactory amf = Persistence.createEntityManagerFactory("HospitalPU");
    
    
    public EntityManager getConnection(){
        return amf.createEntityManager();
    }
}
