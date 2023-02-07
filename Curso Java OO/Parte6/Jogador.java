public class Jogador {
    //Código omitido
    private static int total = 0;

    
    public Jogador(){
       total++;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Jogador.total = total;
    }

}