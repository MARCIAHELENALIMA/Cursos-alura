package br.com.testeavaliacao.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClienteDAO {
		
	public ClienteDAO(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	}
	
	private SessionFactory sessionFactory;
	
	public void adicionarCliente(CadastroClienteController cliente) {
	    Session session = sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    session.save(cliente);
	    session.getTransaction().commit();
	}
	
	public void salvarCliente(CadastroClienteController cliente) {
	    Session session = sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    session.save(cliente);
	    session.getTransaction().commit();
	    session.close();
	}
	
	public void atualizarCliente(CadastroClienteController cliente) {
	    Session session = sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    session.update(cliente);
	    session.getTransaction().commit();
	    session.close();
	}

	public void excluirCliente(CadastroClienteController cliente) {
	    Session session = sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    session.delete(cliente);
	    session.getTransaction().commit();
	    session.close();
	}

	public CadastroClienteController buscarCliente(int id) {
	    Session session = sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    CadastroClienteController cliente = session.get(CadastroClienteController.class, id);
	    session.getTransaction().commit();
	    session.close();
	    return cliente;
	}
}
