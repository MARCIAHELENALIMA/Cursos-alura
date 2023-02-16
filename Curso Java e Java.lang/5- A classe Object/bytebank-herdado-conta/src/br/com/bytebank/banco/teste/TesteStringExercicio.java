package br.com.bytebank.banco.teste;

public class TesteStringExercicio {

    public static void main(String[] args) {

        String nome = "Mario";
        nome.replace('o', 'a');
        System.out.println(nome);
    }
}


//O código compila e roda. 
//O resultado é:
//Mario
//
//Correto, pois o método replace não altera a String original e sim devolve uma nova String. Para contemplar a alteração devemos pegar o resultado do método replace:
//
//String nome = "Mario";
//nome = nome.replace('o', 'a');
//System.out.println(nome);