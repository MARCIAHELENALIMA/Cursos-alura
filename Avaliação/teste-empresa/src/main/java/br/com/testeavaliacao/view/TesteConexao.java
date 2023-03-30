package br.com.testeavaliacao.view;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class TesteConexao {

	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/nomedobanco?useSSL=false&serverTimezone=UTC";
	        String usuario = "meu_usuario";
	        String senha = "minha_senha";

	        try {
	            Connection conexao = DriverManager.getConnection(url, usuario, senha);
	            System.out.println("Conexão realizada com sucesso!");
	            conexao.close();
	        } catch (SQLException e) {
	            System.out.println("Erro ao tentar se conectar ao banco de dados: " + e.getMessage());
	        }
	    }

	}

