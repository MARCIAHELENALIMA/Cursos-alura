
	
	public class Fluxo {

	    public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try {
				metodo1();
			} catch(Exception ex) { //catch genérico, capturando qq exceção
				String msg = ex.getMessage();
				System.out.println("Exception " + msg);
				ex.printStackTrace();
			}
	        }
	        
 
	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	    	   metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");
	        for(int i = 1; i <= 5; i++) {
	            System.out.println(i);
	            Conta c = null;
	            extracted(c).deposita();
	        }
	        
	        System.out.println("Fim do metodo2");
	    }


		private static Conta extracted(Conta c) {
			return c;
		}
	}

