public class Gerente2 extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    //novo método, recebendo dois params
    public boolean autentica(String login, int senha) {
		return false;
        //implementacao omitida
    }

    //outros métodos omitidos
}