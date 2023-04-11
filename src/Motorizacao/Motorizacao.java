package Motorizacao;
public class Motorizacao {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar();
        System.out.println(carro.velocidade);
    }
}
