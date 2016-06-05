package notas.model.bean;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
public class Nota {
	
	@Id
	@GeneratedValue
	private Long idNota;
	
	@Lob
	@Column(nullable=false)
	private String nome;
	
	/*Configurando a coluna para o tipo Text*/
	@Lob
	@Column(columnDefinition = "MEDIUMTEXT",nullable=false)
	private String texto;
	
	
	
	@Temporal(TemporalType.TIMESTAMP) //pegar tanto hora quanto a hora
	private Calendar dataHora;
	
	
	/*Criando um campo do tipo usuario para indicar que aquela nota 
	 * so podera ser acessada e usada por tal usuario*/
	/*Configurando a chave estrangeira*/
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	@NotFound(action=NotFoundAction.IGNORE)
	//@Lob
	//@Column(nullable = false)
	private Usuario usuario;
	
	
	
	/*Metodos de Getters and Setters*/
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return idNota;
	}

	public void setId(Long id) {
		this.idNota = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Calendar getDataHora() {
		return dataHora;
	}

	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}
	
	
	

	public String toString(){
		
		/*return this.id + "-" + this.nome + this.data + "-" +
					"\n" + this.texto; */
		return this.idNota + "-" + this.nome + this.dataHora + "-" +
				"\n" + this.texto;
	}
}
