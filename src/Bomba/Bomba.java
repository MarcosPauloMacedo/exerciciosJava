package Bomba;

import java.util.Timer;
import java.util.TimerTask;

public class Bomba {
    private boolean status;

    public TimerTask intervalo (int temporizador, Bomba bomba){

        TimerTask timerTask = new TimerTask() {
            private int contador = 0;
            private int segundos = temporizador;

            public void run(){

                if(this.contador < temporizador){
                    System.out.printf("Falta %d segundos para a bomba desligar \n",this.segundos);
                    this.contador++;
                    this.segundos --;
                }
                else{
                    bomba.desligar();
                    cancel();
                    System.exit(0);
                }
            }
        };

        return timerTask;
    }

    public void ligar(int segundos){
        this.status = true;
        int execInicial = 0;
        int periodo = 1000;

        Timer tempo = new Timer();
        tempo.scheduleAtFixedRate(this.intervalo(segundos,new Bomba()), execInicial,periodo);
    }

    public void desligar(){
        this.status = false;
        System.out.println("Bomba desligada!");
    }

    public boolean status(){
        return this.status;
    }
}

