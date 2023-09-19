import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Volador> objetosVoladores = new ArrayList<>();

        // Crear objetos voladores y agregarlos a la lista
        objetosVoladores.add(new Avion());
        objetosVoladores.add(new Avioneta());
        objetosVoladores.add(new Helicoptero());
        objetosVoladores.add(new AvionDeCombate());
        objetosVoladores.add(new Dron());
        objetosVoladores.add(new GloboAereostatico());
        objetosVoladores.add(new NaveEspacial());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Respuestas del torre de control:");
        for (Volador objeto : objetosVoladores) {
            if (objeto instanceof PuedeAterrizarEnPista1) {
                PuedeAterrizarEnPista1 voladorPista1 = (PuedeAterrizarEnPista1) objeto;
                if (voladorPista1.puedeAterrizarEnPista1()) {
                    System.out.println(objeto.toString() + ": Puede descender pista 1");
                } else {
                    System.out.println(objeto.toString() + ": No es posible aterrizar en pista 1.");
                }
            } else if (objeto instanceof PuedeAterrizarEnPista2) {
                PuedeAterrizarEnPista2 voladorPista2 = (PuedeAterrizarEnPista2) objeto;
                if (voladorPista2.puedeAterrizarEnPista2()) {
                    System.out.println(objeto.toString() + ": Puede descender pista 2");
                } else {
                    System.out.println(objeto.toString() + ": No es posible aterrizar en pista 2.");

                    // Solicitar autorización adicional
                    boolean autorizacion = voladorPista2.solicitarAutorizacion();
                    if (autorizacion) {
                        System.out.println("Aterrizaje en pista 2 autorizado.");
                    } else {
                        System.out.println("Aterrizaje en pista 2 no autorizado.");
                    } 
                }
            } else {
                System.out.println(objeto.toString() + ": No se puede determinar la pista de aterrizaje.");
            }
        }
    }
}

