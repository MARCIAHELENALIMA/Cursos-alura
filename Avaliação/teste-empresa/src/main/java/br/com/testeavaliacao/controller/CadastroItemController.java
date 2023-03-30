package br.com.testeavaliacao.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.testeavaliacao.modelo.Item;

import java.io.Serializable;

@ManagedBean
@ViewScoped
public class CadastroItemController implements Serializable {

    private Item item;
    private ItemDAO itemDAO;

    public CadastroItemController() {
        this.item = new Item();
        this.itemDAO = new ItemDAO();
    }

    public void cadastrar() {
        itemDAO.adicionarItem(item);
        item = new Item();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}