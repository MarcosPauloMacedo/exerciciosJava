package Banco;

public class MetodosBanco {
    protected int agencia;
    protected int conta;
    protected int saldo;

    public MetodosBanco(int agencia,int conta){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo = 0;
    }

    protected boolean validarValor(int valor) {
        boolean validacao = valor > 0;
        return validacao;
    }

    protected boolean saqueAprovado(int valor){
        boolean validarSaque = this.saldo > valor;
        return validarSaque;
    }

    protected void msg(String mensagem){

        System.out.println(mensagem);
    }

    protected void receberTransferencia(int valor){
        this.saldo += valor;
    }
}
