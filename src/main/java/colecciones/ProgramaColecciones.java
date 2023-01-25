package colecciones;

import java.util.*;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Pieza miPieza1 = new Pieza("DellScreen", "Pantalla");
        Pieza miPieza2 = new Pieza("IntelAtom", "Procesador");
        Pieza miPieza3 = new Pieza("Logitech", "Teclado");
        Pieza miPieza4 = new Pieza("Mocochoft", "Raton");
        Pieza miPieza5 = new Pieza("Mocochoft", "Raton");
        Ordenador miOrdenador = new Ordenador("Dell", "Latitude");
        // Un set no esta ordenado y no permite duplicados (hay que incluir el generate equals y hashcode
        // en la clase definitoria del objeto que va dentro del set
        Set<Pieza> listadoPiezas = new HashSet<>();
        listadoPiezas.add(miPieza1);
        listadoPiezas.add(miPieza2);
        listadoPiezas.add(miPieza3);
        listadoPiezas.add(miPieza4);
        listadoPiezas.add(miPieza5);
        miOrdenador.setPiezas(listadoPiezas);
        System.out.println(miOrdenador.getPiezas());
        // generar lista ordenada (se pueden repetir!)
        List <Pieza> piezasOrdenadas = new LinkedList<>();
        piezasOrdenadas.add(miPieza1);
        piezasOrdenadas.add(miPieza2);
        piezasOrdenadas.add(miPieza3);
        piezasOrdenadas.add(miPieza4);
        piezasOrdenadas.add(miPieza5);
        System.out.println(piezasOrdenadas);
        //
        Map<String, String> clienteMapa = new HashMap<String, String>();
        clienteMapa.put("nombre","pepe");
        clienteMapa.put("direccion", "mi calle");
        clienteMapa.put("tlf","677665+234");
        clienteMapa.put("email","p@p.com");
        System.out.println(clienteMapa);
        //
        List listadoMapas = new ArrayList();
        listadoMapas.add(clienteMapa);
        System.out.println(listadoMapas);
        //
        Map<String, String> clienteMapa2 = new HashMap<String, String>();
        clienteMapa2.put("nombre","Juan");
        clienteMapa2.put("direccion", "la calle de Juan");
        clienteMapa2.put("tlf","+34617239743");
        clienteMapa2.put("email","Juan@joquetio.com");
        listadoMapas.add(clienteMapa2);
        System.out.println(listadoMapas);
        //


    }
}
