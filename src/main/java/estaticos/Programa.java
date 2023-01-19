package estaticos;

public class Programa {
    public static void main(String[] args) {
        System.out.println(Estatica.PI);
        Programa.berrinche();
    }
    public static void berrinche(){
        System.out.println(Estatica.quejido);
    }
}
