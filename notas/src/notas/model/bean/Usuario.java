package notas.model.bean;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;



@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	private Long idUsuario;
	
	@Lob
	@Column(nullable=false)
	private String nome;
	
	@Lob
	@Column(nullable=false)
	private String email;
	
	@Lob
	@Column(nullable=false)
	private String senha;
	
	@Temporal(TemporalType.DATE) //pegar somente a data 
	private Calendar dataCriacao;

	
	/*Um usuario em especifico podera ter varias notas associadas a ele*/
	@OneToMany(cascade = CascadeType.ALL,mappedBy="usuario")
	//@JoinColumn(name = "idNota")
	//@Lob
	//@Column(nullable = false)
	List<Nota> listadeNotas;
	
	
	/*Gettesr and Setters*/
	public Long getId() {
		return idUsuario;
	}

	public void setId(Long id) {
		this.idUsuario = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public List<Nota> getListadeNotas() {
		return listadeNotas;
	}

	public void setListadeNotas(List<Nota> listadeNotas) {
		this.listadeNotas = listadeNotas;
	}

	@Override
	public String toString(){
		return this.idUsuario + "-" + this.nome + "-" + this.email + "-" 
				+ this.senha + "-" + this.dataCriacao;
				
	}
	
	
	
	
	
	
	
	
	
	
	

}
