
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDoGiovanne = new Conta();
		System.out.println(contaDoGiovanne.saldo);
		
		contaDoGiovanne.titular = new Cliente();
		System.out.println(contaDoGiovanne.titular);
		
		contaDoGiovanne.titular.nome = "Giovanne de Lima Porto";
		System.out.println(contaDoGiovanne.titular.nome);
		
	}
}
