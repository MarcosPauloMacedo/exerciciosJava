package exercicios;
public class Fibonacci {
    public void metodoFibonacci(int numero){
        int n = 1;
        int n2 = 0;
        int aux;

        System.out.println(n);
        for(int i = 1; i<numero; i++){
            int res = n + n2;
            System.out.println(res);
            aux = n;
            n = res;
            if(aux>0){
                n2 = aux;
            }
        }
    }
}
