
	
	public class FluxoComTratamento {

	    public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try { 
	        metodo1();
	        } catch (ArithmeticException | NullPointerException | MinhaExceção ex){
	        	String msg = ex.getMessage();
	           	System.out.println("Exception" + msg);
	           	ex.printStackTrace();
	        }
	            System.out.println("Fim do main");
	        }
 
	    private static void metodo1() throws MinhaExceção{
	        System.out.println("Ini do metodo1");
	    	   metodo2();
	        System.out.println("Fim do metodo1");
	    }

//	    private static void metodo2() {
//	        System.out.println("Ini do metodo2");
//	        ArithmeticException excepition = new ArithmeticException();
//	        System.out.println("Fim do metodo2");
//	    }
	    
	    //forma mais inchuta do exercicio
	    private static void metodo2() throws MinhaExceção{
	        System.out.println("Ini do metodo2");
	        throw new MinhaExceção(" deu muito errado");
	        //System.out.println("Fim do metodo2");
	    }   
	}

