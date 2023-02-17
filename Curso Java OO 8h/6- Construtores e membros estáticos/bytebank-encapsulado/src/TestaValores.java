
public class TestaValores {
 
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24567);
		
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123123123);
		
		Conta conta2 = new Conta(1337, 56789);
		
		System.out.println(Conta.getTotal());
	}
}
