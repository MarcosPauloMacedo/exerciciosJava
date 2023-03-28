package Banco;

public class Dados {
    private String nome;
    private Endereco endereco;
    private String profissao;

    public Dados(String nome,Endereco endereco,String profissao){
        this.nome = nome;
        this.endereco = endereco;
        this.profissao = profissao;
    }

    public String nome(){

        return this.nome;
    }
    public String[] endereco(){

        String[] meuEndereco = {endereco.estado(),endereco.cidade(),
                endereco.bairro(),endereco.logradouro(),endereco.numero()};

        return meuEndereco;
    }

    public String profissao(){

        return this.profissao;
    }

    public void mudarNome(String novoNome){

        this.nome = novoNome;
    }

    public void mudarProfissao(String novaProfissao){

        this.profissao = novaProfissao;
    }
}
