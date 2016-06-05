package notas.model.dao.test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.hibernate.util.*;

import junit.framework.Assert;
import notas.model.bean.Nota;
import notas.model.bean.Usuario;
import notas.model.dao.JPAUtil;
import notas.model.dao.NotaDAO;
import notas.model.dao.UsuarioDAO;

public class UsuarioDAOTest {
	
	//Solicitando uma conexao com o banco de dados
	EntityManager entityManager = JPAUtil.getEntityManager();
	UsuarioDAO dao = new UsuarioDAO(entityManager);
	List<Usuario> usl = new ArrayList<Usuario>(); //para listar os usuarios
	
	
	/*Criando novos Usuarios*/
	Usuario usuario = new Usuario();
	Usuario usuario2 = new Usuario();
	Usuario usuario3 = new Usuario();
	
	/*Criando novas notas*/
	Nota nota = new Nota();
	Nota nota2 = new Nota();
	Nota nota3 = new Nota();

//	@Test
//	public void testCadastrar() {
//		
//		//iniciando a transacao
//		entityManager.getTransaction().begin();
//		
//		/*Abaixo sera criado dois novos usuarios para realizacao dos 
//		 * testes de integracao.*/
//		
//		
//		usuario.setNome("Edson Jr");
//		usuario.setSenha("atk7v");
//		usuario.setEmail("eds@gmail.com");
//		usuario.setDataCriacao(Calendar.getInstance());
//		
//		/*Pelo fato de haver uma chave estrangeira e um relacionamento
//		 * de um para muitos com a nota, e necessario criar uma lista com 
//		 * as notas referentes a aquele usuario em especifico*/
//		
//	
//		
//		nota.setNome("Nota Teste - Chave Estrangeira");
//		nota.setTexto("Texto teste com chave estrangeira");
//		nota.setDataHora(Calendar.getInstance());
//		
//		
//		nota2.setNome("Nota Teste 2 - Chave Estrangeira");
//		nota2.setTexto("Texto de teste com chave estrangeira");
//		nota2.setDataHora(Calendar.getInstance());
//		
//		//criando agora a lista para por esta nota
//		List<Nota> listaDeNotas = new ArrayList<>();
//		listaDeNotas.add(nota);
//		listaDeNotas.add(nota2);
//		
//		
//		
//		/*Agora vamos associar um usuario a lista de notas dele e 
//		 * a lista de notas ao usuario em especifico. Essa asociacao
//		 * ira garantir a troca de informacoes referentes a ambas as 
//		 * tabelas*/
//		usuario.setListadeNotas(listaDeNotas);
//		nota.setUsuario(usuario);
//		nota2.setUsuario(usuario);
//	
//		/*setando o usuario 2*/
//		usuario2.setNome("Nivea");
//		usuario2.setEmail("nivea@gmail.com");
//		usuario2.setSenha("1234");
//		usuario2.setDataCriacao(Calendar.getInstance());
//		
//		
//		/*Criando uma nota para asociar ao usuario2*/
//		
//		nota3.setNome("Nota Usuario 2");
//		nota3.setTexto("Nota do usuario2");
//		nota3.setDataHora(Calendar.getInstance());
//		
//		/*Criando uma lista de notas para o usuario 2*/
//		List<Nota> listaDeNotas2 = new ArrayList<>();
//		listaDeNotas2.add(nota3);
//		
//		
//		/*Associando nota e usuario*/
//		nota3.setUsuario(usuario2);
//		usuario2.setListadeNotas(listaDeNotas2);
//		
//		
//		/*Setando o usuario 3*/
//		usuario3.setNome("Laize");
//		usuario3.setEmail("lay@gmail.com");
//		usuario3.setSenha("layala");
//		usuario3.setDataCriacao(Calendar.getInstance());
//		usuario3.setListadeNotas(null);
//		
//		//passando o usuario criado para o dao
//		dao.cadastrar(usuario);
//		dao.cadastrar(usuario2);
//		dao.cadastrar(usuario3);
//		
//		
//		
//		
//		/*Aqui a instrucao de remover funciona*/
//		//dao.remover(usuario);
//		
//		//comitando e fechando a conexao
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		
//		
//				
//		//realizando o teste de cadastro
//		Assert.assertNotNull(usuario.getId());
//		Assert.assertNotNull(usuario2.getId());
//		
//		
//		
//	}
//
//	@Test
//	public void testAlterar() {
//		dao.getEntityManager().getTransaction().begin();
//		Usuario us = entityManager.find(Usuario.class, 1L);
//		us.setNome("FULANO");
//		dao.alterar(us);
//		dao.getEntityManager().getTransaction().commit();
//		
//	}
//
//	@Test
//	public void testRemover() {
//		
//		Usuario usd = new Usuario();
//		usd.setId(2L);
//		dao.getEntityManager().getTransaction().begin();
//		dao.remover(usd);
//		dao.getEntityManager().getTransaction().commit();
//	}

//	@Test
//	public void testConsultar() {
//		Usuario usc = new Usuario();
//		usc = dao.consultar(1L);
//		System.out.println(usc.toString());
//	}
//
//	@Test
//	public void testListar() {
//		usl = dao.listar();
//		if (usl == null){
//			System.out.println("Lista de usuarios nula!");
//		}
//		else {
//			System.out.println(usl.toString());
//		}
//	} 

}
