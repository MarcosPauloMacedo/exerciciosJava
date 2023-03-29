package Fatorial;
public class Fatorial {
    public int fatorar(int numero){
        int resultado = 1;
        for(int i = numero;i> 0;i--){
            resultado = resultado * i;
        }
        return resultado;
    }
}
