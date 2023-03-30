package br.com.testeavaliacao.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import br.com.testeavaliacao.modelo.Item;

public class ItemDAO {

    private SessionFactory sessionFactory;

    public ItemDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public ItemDAO() {
		// TODO Auto-generated constructor stub
	}

	public void adicionarItem(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
    }

    public void salvarItem(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(item);
        session.getTransaction().commit();
    }

    public void atualizarItem(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(item);
        session.getTransaction().commit();
    }

    public void excluirItem(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(item);
        session.getTransaction().commit();
    }

    public Item buscarItem(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Item item = session.get(Item.class, id);
        session.getTransaction().commit();
        return item;
    }
}




