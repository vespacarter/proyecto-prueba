package colecciones;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Ordenador implements Serializable {
    private String marca;
    private String modelo;

    // private Pieza pieza;
    private Set<Pieza> piezas;

    public Ordenador(Set<Pieza> piezas) {
        this.piezas = piezas;
    }



    public Ordenador() {
    }
    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Set<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(Set<Pieza> piezas) {
        this.piezas = piezas;
    }
}
