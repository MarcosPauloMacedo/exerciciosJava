package Banco;

public class Banco extends MetodosBanco {
    private Dados titular;

    public Banco(int agencia, int conta, Dados titular) {
        super(agencia,conta);
        this.titular = titular;
    }

    public int agencia(){

        return this.agencia;
    }

    public int conta(){

        return this.conta;
    }


    public int saldo(){

        return this.saldo;
    }

    public String[] enderecoTitular(){

        return titular.endereco();
    }

    public String nomeTitular(){

        return titular.nome();
    }

    public void sacar(int valor) {

        if (this.validarValor(valor)) {
            if(this.saqueAprovado(valor)){
                this.saldo -= valor;
                this.msg("Saque realizado com sucesso!");
            }
            else{
                this.msg("Saldo insuficiente!");
            }
        }
        else{
            this.msg("Valor inválido de saque! tente novamente");
        }
    }

    public void depositar(int valor){
        if(this.validarValor(valor)){
            this.saldo += valor;
            this.msg("Depósito realizado com sucesso!");
        }
        else{
            this.msg("Valor inválido! tente novamente");
        }
    }

    public void transferir(int valor,Banco banco){
        if(this.validarValor(valor)){
            if(this.saqueAprovado(valor)){
                this.saldo -= valor;
                banco.receberTransferencia(valor);
                this.msg("transferencia realizada com sucesso!");
            }
            else{
                this.msg("Saldo insuficiente!");
            }
        }
        else{
            this.msg("Valor inválido! Tente novamente");
        }
    }

    public void mudarNumeroConta(int novaConta){

        this.conta = novaConta;
    }

    public void mudarNumeroAgencia(int novoNumero){

        this.agencia = novoNumero;
    }
}

