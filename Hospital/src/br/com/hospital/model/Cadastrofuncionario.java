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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "cadastrofuncionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastrofuncionario.findAll", query = "SELECT c FROM Cadastrofuncionario c"),
    @NamedQuery(name = "Cadastrofuncionario.findById", query = "SELECT c FROM Cadastrofuncionario c WHERE c.id = :id"),
    @NamedQuery(name = "Cadastrofuncionario.findByCpf", query = "SELECT c FROM Cadastrofuncionario c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cadastrofuncionario.findByNome", query = "SELECT c FROM Cadastrofuncionario c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cadastrofuncionario.findByCargo", query = "SELECT c FROM Cadastrofuncionario c WHERE c.cargo = :cargo"),
    @NamedQuery(name = "Cadastrofuncionario.findByEmail", query = "SELECT c FROM Cadastrofuncionario c WHERE c.email = :email"),
    @NamedQuery(name = "Cadastrofuncionario.findByCelular", query = "SELECT c FROM Cadastrofuncionario c WHERE c.celular = :celular")})
public class Cadastrofuncionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cpf")
    private int cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "email")
    private String email;
    @Column(name = "celular")
    private String celular;

    public Cadastrofuncionario() {
    }

    public Cadastrofuncionario(Integer id) {
        this.id = id;
    }

    public Cadastrofuncionario(Integer id, int cpf) {
        this.id = id;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastrofuncionario)) {
            return false;
        }
        Cadastrofuncionario other = (Cadastrofuncionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hospital.model.Cadastrofuncionario[ id=" + id + " ]";
    }
    
}
