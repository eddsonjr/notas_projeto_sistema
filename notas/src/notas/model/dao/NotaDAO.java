package notas.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import notas.model.bean.Nota;

public class NotaDAO {
	
	private EntityManager entityManager;
	
	
	/*construtor*/
	public NotaDAO(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	/**
	 * Cadastra uma nota no banco de dados
	 * @param nota (objeto do tipo Nota)*/
	public void cadastrar(Nota nota){
			entityManager.persist(nota);
	}
	
	
	/**
	 * Altera os dados ja cadastrados no banco de dados
	 * @param nota (objeto do tipo Nota)*/
	public void alterar(Nota nota){
			entityManager.merge(nota);
	}
	
	
	
	/**
	 * Remove um determinaod elemento do banco de dados
	 * @param nota (objeto do tipo Nota)*/
	public void remover(Nota nota){
		entityManager.remove(nota);
	}

	
	/**
	 * <TALVEZ ESTE METODO NAO SEJA APLICAVEL>
	 * Retorna uma instancia da classe Nota para consultar dados
	 * @return nota
	 * */
	public Nota consultar(Long id){
			return entityManager.getReference(Nota.class,id);
	}

	/**
	 * Retorna uma lista de Notas
	 * @return List<Notas>
	 * */
	public List<Nota> listar(){
		
			String jpql = "Select n from Nota as n";
			Query query = entityManager.createQuery(jpql);
			return query.getResultList();
	}


	public EntityManager getEntityManager() {
		return entityManager;
	}


}




