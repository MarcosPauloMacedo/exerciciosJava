package Banco;

import java.util.Arrays;

public class TestBanco {
    public static void main(String[] args) {
        Dados meusDados = new Dados("marcos",
                new Endereco("MG","Araguari",
                        "Goias","rua jose","32"),"programador");

        Banco conta1 = new Banco(002,23, meusDados);

        System.out.println(Arrays.toString(conta1.enderecoTitular()));
    }
}
