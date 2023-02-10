
public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		}else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
}
