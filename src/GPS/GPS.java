package GPS;
public class GPS {
    private String idioma;
    private String rota;

    public GPS(String idioma,String rota){
        this.definirIdioma(idioma);
        this.definirRota(rota);
    }

    public GPS(){
        this.idioma = "Português";
        this.rota = "Qualquer rota";
    }

    public void definirIdioma(String idioma){

        String[] idiomas = {"português","inglês","espanhol","francês","alemão"};
        boolean encontrado = false;

        for(String id : idiomas){
            if(id.equals(idioma)){
                System.out.printf("idioma %s selecionado com sucesso!",idioma);
                this.idioma = idioma;
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("Idioma não encontrado! tente novamente!");
        }
    }

    public void definirRota(String rota){
        this.rota = rota;
        System.out.printf("Sua rota será %s \n",this.rota);
    }

    public void mostrar(){
        System.out.println(this.rota);
        System.out.println(this.idioma);
    }
}
