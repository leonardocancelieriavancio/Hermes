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
@Table(name = "participacaoEvento")
public class ParticipacaoEvento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;	
	
    @ManyToOne
    @JoinColumn(name="id_evento")
    private Evento evento;
 
    private Boolean notificacaoEnviada;
    
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Boolean getNotificacaoEnviada() {
        return notificacaoEnviada;
    }

    public void setNotificacaoEnviada(Boolean notificacaoEnviada) {
        this.notificacaoEnviada = notificacaoEnviada;
    } 
}
