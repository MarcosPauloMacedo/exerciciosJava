package Banco;

public class Bradesco extends Banco{
    public Bradesco(int agencia, int conta,Dados titular){
        super(agencia,conta,titular);
    }

    public void sacar(int valor){
        int tarifa = valor + 1;
        super.sacar(valor);
    }

    public void transferir(int valor,Banco banco){
        int tarifa = valor + 2;
        super.transferir(valor,banco);
    }
}
