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
@Table(name = "leituraNoticia")
public class LeituraNoticia {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
    @ManyToOne
    @JoinColumn(name="id_usuario")
	private Usuario usuario;	
	
	@ManyToOne
    @JoinColumn(name="id_noticia")
	private Noticia noticia;
	
    private Boolean efetuada;
    
    private String dt_cadastro;    
    
    private String hr_cadastro;    
            
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	public Boolean getEfetuada() {
        return efetuada;
    }

    public void setEfetuada(Boolean efetuada) {
        this.efetuada = efetuada;
    }

	public String getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(String dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public String getHr_cadastro() {
		return hr_cadastro;
	}

	public void setHr_cadastro(String hr_cadastro) {
		this.hr_cadastro = hr_cadastro;
	}
}
