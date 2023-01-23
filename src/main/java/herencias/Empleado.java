package herencias;

public class Empleado extends Persona{
    //*public String nombre;
    public String dni;
    public Integer sueldo;
    public String cargo;

    public Empleado() {
        super();
        this.dni = "";
        this.sueldo = 0;
        this.cargo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado(String nombre, String dni, Integer sueldo, String cargo) {
     //*   this.nombre = nombre;
        super(nombre);
        this.dni = dni;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
