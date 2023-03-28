package controle;

public class UsaRobo {

    public static void main(String[] args) {
        Robo meuRobo = new Robo("Tec", 1.30f);
        meuRobo.setPassos(32);
        System.out.println(meuRobo.getPassos());
    }
}
