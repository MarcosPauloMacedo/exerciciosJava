package Banco;

public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String numero;

    public Endereco(String estado,String cidade,String bairro,String logradouro,String numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String estado(){

        return this.estado;
    }

    public String cidade(){

        return this.cidade;
    }

    public String bairro(){

        return this.bairro;
    }

    public String logradouro(){

        return this.logradouro;
    }

    public String numero(){

        return this.numero;
    }
}

