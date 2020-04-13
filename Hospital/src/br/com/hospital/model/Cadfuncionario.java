/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hospital.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "cadfuncionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadfuncionario.findAll", query = "SELECT c FROM Cadfuncionario c"),
    @NamedQuery(name = "Cadfuncionario.findByCpf", query = "SELECT c FROM Cadfuncionario c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cadfuncionario.findByNome", query = "SELECT c FROM Cadfuncionario c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cadfuncionario.findByCargo", query = "SELECT c FROM Cadfuncionario c WHERE c.cargo = :cargo"),
    @NamedQuery(name = "Cadfuncionario.findByEmail", query = "SELECT c FROM Cadfuncionario c WHERE c.email = :email"),
    @NamedQuery(name = "Cadfuncionario.findByCelular", query = "SELECT c FROM Cadfuncionario c WHERE c.celular = :celular")})
public class Cadfuncionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "email")
    private String email;
    @Column(name = "celular")
    private String celular;

    public Cadfuncionario() {
    }

    public Cadfuncionario(String cpf) {
        this.cpf = cpf;
    }

    public Cadfuncionario(String cpf, String nome, String cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadfuncionario)) {
            return false;
        }
        Cadfuncionario other = (Cadfuncionario) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hospital.model.Cadfuncionario[ cpf=" + cpf + " ]";
    }
    
}
