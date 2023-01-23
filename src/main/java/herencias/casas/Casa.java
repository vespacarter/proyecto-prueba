package herencias.casas;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Casa {
    private String direccion;
    private Float metroscuadrados;

    Casa(){
        this.direccion = "";
        this.metroscuadrados=1.0F;
    }
}
