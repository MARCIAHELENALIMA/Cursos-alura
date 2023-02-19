
public class Exercicio {

	public static void main(String[] args) {
		
	
	//FORMA DE ADICIONAR EXTENSA E NAO UTILIZADA PARA RESOLVER MAIS DE UMA EXCEPTION
	try {
	    System.out.println(1/0);
	} catch(ArithmeticException ex) {
	    ex.printStackTrace();
	} catch(NullPointerException ex) {
	    ex.printStackTrace();    
	}
	
	//FORMA RESUMIDA DE ADICIONAR MAIS DE UMA EXCEPTION
	try {
	    System.out.println(1 / 0);
	} catch (ArithmeticException | NullPointerException ex) {
	    ex.printStackTrace();
	}
}
}
