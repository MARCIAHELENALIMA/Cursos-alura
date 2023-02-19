package br.com.bytebank.banco.teste;


public class TesteExercicio2 {

    public static void main(String[] args) {
    		String nome = "Mario"; //object literal
    	    String outro = new String("Alura"); //má prática, sempre prefere a sintaxe literal
    	    
    	    String novo = outro.replace("A", "a");

    	    System.out.println(novo);
    	    
    	    //String novo = nome.toLowerCase(); //também teste toUpperCase()

    	    char c = nome.charAt(3); //char i
    	    System.out.println(c);

    	    int pos = nome.indexOf("rio");
    	    System.out.println(pos);

    	    String sub = nome.substring(1);
    	    System.out.println(sub);
    	    
    	    for(int i = 0; i < nome.length(); i++) {
    	        System.out.println(nome.charAt(i));
    	    } 
    	    
    	    System.out.println(novo);
    	}

	}

/**
    public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
	
	
		private Object builder;
		String texto = builder.toString();
		public TesteExercicio2(StringBuilder builder) {
			this.builder = builder;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			Object builder;
			result = prime * result + ((builder == null) ? 0 : builder.hashCode());
			result = prime * result + ((texto == null) ? 0 : texto.hashCode());
			return result;
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TesteExercicio2 other = (TesteExercicio2) obj;
			Object builder;
			if (builder == null) {
				if (other.builder != null)
					return false;
			} else if (!builder.equals(other.builder))
				return false;
			if (texto == null) {
				if (other.texto != null)
					return false;
			} else if (!texto.equals(other.texto))
				return false;
			return true;
		}
		
		public StringBuilder getBuilder() {
			return (StringBuilder) builder;
		}
		public void setBuilder(StringBuilder builder) {
			this.builder = builder;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
	
	
		public void setBuilder(Object builder) {
			this.builder = builder;
		}
	
	
		public TesteExercicio2(Object builder, String texto) {
			this.builder = builder;
			this.texto = texto;
		}
		 
	}
	
	 */