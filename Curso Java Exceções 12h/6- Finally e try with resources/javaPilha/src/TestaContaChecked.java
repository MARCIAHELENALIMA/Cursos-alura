
public class TestaContaChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExceção ex) {
			System.out.println("Tratamento ....");
		}
	}
}
