package herencias.casas;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class Chalet extends Casa  {
    private Integer plantas;

    public Chalet(String direccion, Float metroscuadrados, Integer plantas) {
        super(direccion, metroscuadrados);
        this.plantas = plantas;
    }

    public Chalet() {
        super();
        this.plantas = plantas;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "direccion=" + getDireccion() +
                " metroscuadrados=" + getMetroscuadrados() +
                " plantas=" + plantas +
                '}';
    }
}
