package herencias;

public class Persona {
    public String nombre;
    public String apellidos;
    public Integer edad;

    public Persona(String nombre, String apellidos, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(){
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }
}
