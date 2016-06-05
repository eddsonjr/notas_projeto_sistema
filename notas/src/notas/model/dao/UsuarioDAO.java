package notas.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import notas.model.bean.Nota;
import notas.model.bean.Usuario;

public class UsuarioDAO {
	
	private EntityManager entityManager;
	
	/*construtor*/
	public UsuarioDAO(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	
	/**
	 * Cadastra um Usuario no banco de dados
	 * @param usuario (objeto do tipo Usuario)*/
	public void cadastrar(Usuario usuario){
			entityManager.persist(usuario);
	}
	
	
	
	/**
	 * Altera os dados ja cadastrados no banco de dados
	 * @param a (objeto do tipo Usuario)*/
	public void alterar(Usuario usuario){
			entityManager.merge(usuario);
	}
	
	
	/**
	 * Remove um determinaod elemento do banco de dados
	 * @param usuario (objeto do tipo Usuario)*/
	public void remover(Usuario usuario){
		Long nfk = usuario.getId();
		String q = "delete Nota where idUsuario = "+nfk.toString();
		Query query = entityManager.createQuery(q);
		int rq = query.executeUpdate();
		if(rq > 0) 
			entityManager.remove(entityManager.merge(usuario));
		else
			System.err.println("Erro ao excluir dados");
	}

	
	/**
	 * Retorna uma instancia da classe usuario para consultar dados
	 * @return usuario
	 * */
	public Usuario consultar(Long id){
		return entityManager.getReference(Usuario.class,id);
	}

	/**
	 * Retorna uma lista de usuarios
	 * @return List<Usuarios>
	 * */
	public List<Usuario> listar(){
			String jpql = "Select U from Usuario as U";
			Query query = entityManager.createQuery(jpql);
			return query.getResultList();
	}


	public EntityManager getEntityManager() {
		return entityManager;
	}

}