

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente nico = new Gerente();
	    nico.setNome("Nico Steppot");
	    nico.setCpf("22222222-2");
	    nico.setSalario(2650.80);
	    
	    System.out.println(nico.getNome());
	    System.out.println(nico.getBonificacao());
	    
	}
}
