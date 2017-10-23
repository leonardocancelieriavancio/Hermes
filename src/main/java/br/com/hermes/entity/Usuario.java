package br.com.hermes.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
*
* @author Fabio Eduardo do Vale
* @author Jamila Peripolli Souza
* @author Leonardo Cancelieri Avancio
*/

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("U")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String nome;
    private String cpf;
    private String senha;
    private String email;
    private String emailcelular;
    private boolean isComunidade;
    @Column(insertable=false, updatable=false)
    private String tipo;

    @ManyToOne
    @JoinColumn(name="id_instituicao")
    private Instituicao instituicao;
    
    @ManyToOne
    @JoinColumn(name="id_turma")    
    private Turma turma;

        
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isComunidade() {
		return isComunidade;
	}

	public void setComunidade(boolean isComunidade) {
		this.isComunidade = isComunidade;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailcelular() {
        return emailcelular;
    }

    public void setEmailcelular(String emailcelular) {
        this.emailcelular = emailcelular;
    }

    public boolean isIsComunidade() {
        return isComunidade;
    }

    public void setIsComunidade(boolean isComunidade) {
        this.isComunidade = isComunidade;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
