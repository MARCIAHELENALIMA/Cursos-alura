package br.com.bytebank.banco.modelo;


/**
 * Classe que representa um cliente no bytebank
 * @author Marcia Helena
 * 
 */

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    /**
     * valor precisa ser maior que o saldo
     * 
     * @param conta 
     * @param valor
     * @throws SaldoInsuficienteException
     */
    
    public void saca(Conta conta, double valor) throws SaldoInsuficienteException{
    	
        if(conta.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + conta.saldo + ", Valor: " + valor);
        } 
        
        conta.saldo -= valor;       
    }

}
