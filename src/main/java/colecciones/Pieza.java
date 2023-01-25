package colecciones;



import java.io.Serializable;
import java.util.Objects;

public class Pieza implements Serializable {
    private String nombre;
    private String tipo;

    public Pieza(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieza pieza = (Pieza) o;
        return Objects.equals(nombre, pieza.nombre) && Objects.equals(tipo, pieza.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo);
    }
}
