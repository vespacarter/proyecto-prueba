package herencias;

public class EmpleadosApp {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado( "John Doo", "123456789A", 25000, "Limpiaventanas" );
        System.out.println(empleado2.getNombre());
        System.out.println(empleado2.getCargo());
        System.out.println(empleado2);
    }
}
