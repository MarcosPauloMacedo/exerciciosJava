package Motorizacao;

public class Carro {
    private String fabricante;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private boolean estaLigado = false;
    public int velocidade;
    public final int limiteVelocidade = 160;
    public void acelerar(){
        velocidade++;
    }
}
