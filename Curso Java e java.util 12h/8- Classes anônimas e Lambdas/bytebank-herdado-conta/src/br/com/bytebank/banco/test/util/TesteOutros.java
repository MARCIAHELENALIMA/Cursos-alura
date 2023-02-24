package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutros {

	public static void main(String[] args) {
		
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue());  //unboxing
        
        Double dRef = Double.valueOf(3.2); //autoboxing
        System.out.println(dRef.doubleValue());  //unboxing
	
	    Boolean bRef = Boolean.FALSE;
	    System.out.println(bRef.booleanValue());
	    
	   Number refNumero = Double.valueOf(29.9f);
	   
	   
	   List<Number> lista = new ArrayList<>();
	   lista.add(10);
	   lista.add(25);
	   lista.add(32.5);
	   lista.add(124.9f);
	   lista.add(12.2f);
        
	
	}
}
