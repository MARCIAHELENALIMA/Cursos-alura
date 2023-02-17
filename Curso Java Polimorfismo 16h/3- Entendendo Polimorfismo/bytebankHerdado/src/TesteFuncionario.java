

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
	    nico.setNome("Nico Steppot");
	    nico.setCpf("22222222-2");
	    nico.setSalario(2650.80);
	    
	    System.out.println(nico.getNome());
	    System.out.println(nico.getBonificacao());
	    
	}
}
