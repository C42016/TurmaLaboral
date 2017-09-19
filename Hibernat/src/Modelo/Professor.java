/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jossefa Tamele
 */
@Entity
public class Professor {
    
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String disciplina;
    private String email;
    
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date datanacimento; 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatanacimento() {
        return datanacimento;
    }

    public void setDatanacimento(Date datanacimento) {
        this.datanacimento = datanacimento;
    }
    
    
}
