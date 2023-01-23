package herencias.casas;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class ChaletDeLujo extends  Chalet {
    private Integer retretes;

    public ChaletDeLujo(String direccion, Float metroscuadrados, Integer plantas, Integer retretes) {
        super(direccion, metroscuadrados, plantas);
        this.retretes = retretes;
    }

    public ChaletDeLujo(){
        super();
        this.retretes = retretes;

    }

    @Override
    public String toString() {
        return "ChaletDeLujo{" +
                "direccion=" + getDireccion() +
                " metroscuadrados=" + getMetroscuadrados() +
                " plantas=" + getPlantas() +
                " retretes=" + retretes +
                '}';
    }
}
