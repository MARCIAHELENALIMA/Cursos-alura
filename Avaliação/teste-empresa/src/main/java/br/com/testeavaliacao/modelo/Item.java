package br.com.testeavaliacao.modelo;

	public class Item {
	    private String nome;
	    private String descricao;
	    private int quantidade;

	  
	    public Item(String nome, String descricao, int quantidade) {
	        this.nome = nome;
	        this.descricao = descricao;
	        this.quantidade = quantidade;
	    }

	    public Item() {
			// TODO Auto-generated constructor stub
		}

		// getters e setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }
	}
