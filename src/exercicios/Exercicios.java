package exercicios;

class Exercicios{
    public String identificarNumeroImpar(int numero){
        String resultado = numero % 2 != 0 ?
                String.format("O numero %d é impar!",numero) :
                String.format("O numero %d não é impar!",numero);

        return resultado;
    }

    public void contagemRegressiva(int numero){
        if(numero <= 0){
            System.out.println("O número dever ser maior que zero!");
        }
        else {
            for (int i = numero; i > 0; i--) {
                System.out.println(i);
            }
        }
    }

    public void multiplos4entre100(){
        //Método que marca os números divisíveis por 4 entre 0 e 100

        for(int i = 100; i>0; i--){
            if(i % 4 == 0){
                System.out.println(String.format("[%d]",i));
            }
            else{
                System.out.println(i);
            }
        }
    }
}

