
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24567);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente giovanne = new Cliente();
		giovanne.setNome("Giovanne de Lima Porto");
		
		conta.setTitular(giovanne);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("estudante");
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("estudante");
		
        System.out.println(titularDaConta);
        System.out.println(giovanne);
        System.out.println(conta.getTitular());
	}
}
