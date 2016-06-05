package notas.model.control.mb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import notas.model.bean.Nota;
import notas.model.dao.JPAUtil;
import notas.model.dao.NotaDAO;

@ViewScoped
@RequestScoped
@ManagedBean(name="notasMB")
public class NotaMB {
	
	private Nota nota = new Nota();
	
	/*Metodos de getter and setter */
	public Nota getNota(){
		return nota;
	}
	
	public void setNota(Nota nota){
		this.nota = nota;
	}
	
	
	/*Atributo que guarda a colecao de notas requisitadas do banco de dados*/
	public List<Nota> listaNotas = new ArrayList<>();
	
	/*Pegando a lista de notas*/
	public List<Nota> getListaNotas(){
		return listaNotas;
	}
	
	
	/*Metodo que sera responsavel por carregar todos os dados 
	 * das notas do banco de dados e po-los na lista*/
	
	@PostConstruct
	public void carregarNotas(){
		EntityManager em = JPAUtil.getEntityManager();
		NotaDAO dao = new NotaDAO(em);
		listaNotas = dao.listar();
		em.close();
	}
	
	/*Exclui uma nota*/
	public void excluir(){
		EntityManager em = JPAUtil.getEntityManager();
		NotaDAO dao = new NotaDAO(em);
		em.getTransaction().begin();
		dao.remover(nota);
		em.getTransaction().commit();
		em.close();
		carregarNotas();	
	}
	
	/*Salva uma nota ou altera ela*/
	public void salvarNota(){
		EntityManager em = JPAUtil.getEntityManager();
		NotaDAO dao = new NotaDAO(em);
		em.getTransaction().begin();
		nota.setDataHora(Calendar.getInstance());
		if(nota.getId() != null){
			dao.alterar(nota);
		}else{
			dao.cadastrar(nota);
		}
		
		em.getTransaction().commit();
		em.close();
		nota = new Nota();
		carregarNotas();
	}
	
	
	
}
