/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hermes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
*
* @author Fabio Eduardo do Vale
* @author Jamila Peripolli Souza
* @author Leonardo Cancelieri Avancio
*/

@Entity
@Table(name = "setor")
public class Setor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String nome;
    
    @ManyToOne
    @JoinColumn(name="id_instituicao")
    private Instituicao instituicao;

        
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
