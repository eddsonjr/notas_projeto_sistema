package notas.model.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*Esta classe é responsavel por gerenciar a parte de conexao com o banco
de dados*/

public class JPAUtil {
	
	//atributo para criar conexao com o banco
	private static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("nota");
	
	
	/**
	 * Retorna uma nova conexao com o banco de dados
	 * @return emf (entitymanagerfactory criada)*/
	public static EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
	
	

}
