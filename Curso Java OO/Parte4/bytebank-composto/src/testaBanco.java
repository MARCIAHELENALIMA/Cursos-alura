
public class testaBanco {

	public static void main(String[] args) {
		Cliente marcia = new Cliente();
		marcia.nome = "Márcia Helena de Lima";
		marcia.cpf = "000.000.000-00";
		marcia.profissao = "programador";
		
		Conta contaDaMarcia = new Conta();
		contaDaMarcia.deposita(100);
		
		contaDaMarcia.titular = marcia;
		System.out.println(contaDaMarcia.titular.nome);
		System.out.println(contaDaMarcia.titular);
		System.out.println(marcia);
		
	}
}
