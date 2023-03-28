package controle;

public class Controle {
    protected String nome;
    protected double altura;
    protected int passos;
    protected String direcaoAtual;

    public Controle(String nome,double altura){
        this.nome = nome;
        this.altura = altura;
        this.direcaoAtual = null;
        this.passos = 0;
    }

    private void msg(String msg){
        System.out.println(msg);
    }

    protected String getNome(){
        return this.nome;
    }

    protected double getAltura(){
        return this.altura;
    }

    protected int getPassos(){
        return this.passos;
    }

    protected void setNome(String novoNome){
        this.nome = novoNome;
    }

    protected void setAltura(double altura){
        this.altura = altura;
    }

    protected void setPassos(int numeroPassos){
        this.passos += numeroPassos;
        System.out.printf("O numero de passos aumentou para %d",this.passos);
    }

    protected void falar(String frase){
        System.out.printf("O obj diz: ",frase);
    }

    protected void virar(String direcao){
        if(direcao.equals("direita")
                || direcao.equals("esquerda")){

            this.direcaoAtual = direcao;
            System.out.printf("o obj virou para %s",direcao);
        }
        else{
            this.msg("direcao inválida! tente novamente");
        }
    }
}
