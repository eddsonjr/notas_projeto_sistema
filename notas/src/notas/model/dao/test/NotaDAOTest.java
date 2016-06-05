package notas.model.dao.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import junit.framework.Assert;
import notas.model.bean.Nota;
import notas.model.dao.JPAUtil;
import notas.model.dao.NotaDAO;

public class NotaDAOTest {
	
	//Solicitando uma conexao com o banco de dados
	EntityManager entityManager = JPAUtil.getEntityManager();
	NotaDAO dao = new NotaDAO(entityManager);
	List<Nota> ln = new ArrayList<>();

//	@Test
//	public void testCadastrar() {
//		
//		
//		//iniciando a transacao
//		entityManager.getTransaction().begin();
//		
//		//criando uma nova nota para para depois tentar cadastra-lo no banco
//		Nota nota = new Nota();
//		nota.setNome("Nota1");
//		nota.setTexto("Nota Teste 1");
//		nota.setDataHora(Calendar.getInstance());
//		
//		
//		
//		//imprimindo os dados na tela para conferencia
//		System.out.println(nota);
//		//Passando a nota criada para o dao
//		dao.cadastrar(nota);
//		
//		//comitando e fechando a conexao
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		
//		//realizando o teste de cadastro
//		Assert.assertNotNull(nota.getId());
//		
//		//fail("Not yet implemented");
//	}

//	@Test
//	public void testAlterar() {
//		dao.getEntityManager().getTransaction().begin();
//		Nota n = entityManager.find(Nota.class, 1L);
//		n.setNome("NOTA DO FULANO");
//		dao.alterar(n);
//		dao.getEntityManager().getTransaction().commit();
//		
//	}

//	@Test
//	public void testRemover() {
//		Nota nd = new Nota();
//		nd.setId(1L);
//		dao.getEntityManager().getTransaction().begin();
//		nd = entityManager.merge(nd);
//		dao.remover(nd);
//		dao.getEntityManager().getTransaction().commit();
//	}

//	@Test
//	public void testConsultar() {
//		Nota nc = new Nota();
//		nc = dao.consultar(1L);
//		System.out.println(nc.toString());
//	}

//	@Test
//	public void testListar() {
//		ln = dao.listar();
//		if(ln == null){
//			System.err.println("Lista de notas vazia!");
//		}else 
//			System.out.println(ln);
//	}

}
