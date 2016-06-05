package notas.model.control.mb;

import java.util.Calendar;

import javax.faces.bean.ManagedBean;
//import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;

import notas.model.bean.Usuario;
import notas.model.dao.JPAUtil;
import notas.model.dao.UsuarioDAO;


@RequestScoped
@ManagedBean(name="usuarioMB")
public class UsuarioMB {

	private Usuario usuario = new Usuario();
	
	/*Getter do usuario*/
	public Usuario getUsuario(){
		return this.usuario;
	}
	
	
	/**
	 * Permite salvar um usuario no banco.
	 * Nao recebe argumentos nem retorna valores.
	 * Classe: UsuarioMB
	 * */
	public void salvarUsuario(){
		EntityManager em = JPAUtil.getEntityManager();
		UsuarioDAO dao = new UsuarioDAO(em);
		em.getTransaction().begin();
		usuario.setDataCriacao(Calendar.getInstance());
		dao.cadastrar(usuario);
		em.getTransaction().commit();
		em.close();
		usuario = new Usuario();
		
		
	}
}
