package br.com.hermes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*
* @author Fabio Eduardo do Vale
* @author Jamila Peripolli Souza
* @author Leonardo Cancelieri Avancio
*/

@Entity
@Table(name = "instituicao")
public class Instituicao {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String fone;
    private String email;
    private String site;
    
    public Instituicao() {}

	public Instituicao(String nome, String endereco, String bairro, String cidade, String uf, String fone,
			String email, String site) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.fone = fone;
		this.email = email;
		this.site = site;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
}
