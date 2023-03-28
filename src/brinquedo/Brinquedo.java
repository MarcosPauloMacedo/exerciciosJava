package brinquedo;

public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;

    public Brinquedo(){
    }

    public Brinquedo(String nome){
        this.nome = nome;
    }

    public Brinquedo(String nome,float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public float getPreco(){
        return this.preco;
    }

    public String getFaixaEtaria(){
        return this.faixaEtaria;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setPreco(float novoPreco){
        this.preco = novoPreco;
    }

    private void msg(boolean Status){
        String resultado = Status ? "faixa Etária realizada com sucesso!" :
                "faixa etária inválida! tente novamente";

        System.out.println(resultado);
    }

    public void setFaixaEtaria(String novaFaixaEtaria){

        if(novaFaixaEtaria.equals("0 a 2")
                || novaFaixaEtaria.equals("3 a 5")
                || novaFaixaEtaria.equals("6 a 10")
                || novaFaixaEtaria.equals("acima de 10")){
            this.faixaEtaria = novaFaixaEtaria;
            this.msg(true);
        }
        else{
            this.msg(false);
        }
    }
}
