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
@Table(name = "cadcliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadcliente.findAll", query = "SELECT c FROM Cadcliente c"),
    @NamedQuery(name = "Cadcliente.findByCpf", query = "SELECT c FROM Cadcliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cadcliente.findByNome", query = "SELECT c FROM Cadcliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cadcliente.findByDatanascimento", query = "SELECT c FROM Cadcliente c WHERE c.datanascimento = :datanascimento"),
    @NamedQuery(name = "Cadcliente.findBySexo", query = "SELECT c FROM Cadcliente c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Cadcliente.findByTelefone", query = "SELECT c FROM Cadcliente c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cadcliente.findByCelular", query = "SELECT c FROM Cadcliente c WHERE c.celular = :celular"),
    @NamedQuery(name = "Cadcliente.findByTipoplano", query = "SELECT c FROM Cadcliente c WHERE c.tipoplano = :tipoplano"),
    @NamedQuery(name = "Cadcliente.findByEmail", query = "SELECT c FROM Cadcliente c WHERE c.email = :email")})
public class Cadcliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "datanascimento")
    private String datanascimento;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Column(name = "tipoplano")
    private String tipoplano;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public Cadcliente() {
    }

    public Cadcliente(String cpf) {
        this.cpf = cpf;
    }

    public Cadcliente(String cpf, String nome, String datanascimento, String celular, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.celular = celular;
        this.email = email;
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

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipoplano() {
        return tipoplano;
    }

    public void setTipoplano(String tipoplano) {
        this.tipoplano = tipoplano;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Cadcliente)) {
            return false;
        }
        Cadcliente other = (Cadcliente) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hospital.model.Cadcliente[ cpf=" + cpf + " ]";
    }
    
}
