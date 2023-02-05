
public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDaMarcia = new Conta();
		contaDaMarcia.saldo = 100;
		contaDaMarcia.deposita (50);
		System.out.println(contaDaMarcia.saldo);
		boolean conseguiuRetirar  = contaDaMarcia.saca(20);
		System.out.println(contaDaMarcia.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(400, contaDaMarcia);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaMarcia.saldo);
	}

}
