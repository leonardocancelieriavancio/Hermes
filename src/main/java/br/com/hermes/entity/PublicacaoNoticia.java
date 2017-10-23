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
@Table(name = "publicacaoNoticia")
public class PublicacaoNoticia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private Boolean todos;
    
    @ManyToOne
    @JoinColumn(name="id_turma")    
    private Turma turma;
    
    @ManyToOne
    @JoinColumn(name="id_setor")
    private Setor setor;
    
    @ManyToOne
    @JoinColumn(name="id_noticia")
    private Noticia noticia;
    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	public Boolean getTodos() {
        return todos;
    }

    public void setTodos(Boolean todos) {
        this.todos = todos;
    }
}
