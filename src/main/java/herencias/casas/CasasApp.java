package herencias.casas;

public class CasasApp {

    public static void main(String[] args) {
        Casa casa = new Casa();
        System.out.println(casa);
        Chalet chalet = new Chalet();
        System.out.println(chalet);
        Chalet chaletazo  = new Chalet("Plaza de las navajas" , 20.0F, 2);
        System.out.println(chaletazo);
        ChaletDeLujo chaletdelujo = new ChaletDeLujo("Monterrozas", 300.0F, 5, 10);
        System.out.println(chaletdelujo);
    }
}
