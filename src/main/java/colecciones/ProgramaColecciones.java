package colecciones;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Pieza miPieza = new Pieza("DellScreen", "Pantalla");
        Ordenador miOrdenador = new Ordenador("Dell", "Latitude");
        miOrdenador.setPieza(miPieza);
        System.out.println(miOrdenador.getPieza());
    }
}
