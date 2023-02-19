public class TestaContaChecked {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();
        } catch(final MinhaExcecao ex) {
            System.out.println("tratamento ....");
        }

    }
}