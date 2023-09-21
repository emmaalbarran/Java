import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Volador> objetosVoladores = new ArrayList<>();

        objetosVoladores.add(new Avion("Avion","HGA-978D", "Comercial"));
        objetosVoladores.add(new Helicoptero("Helicoptero", "87S-SDNS", "Comercial"));
        objetosVoladores.add(new Avioneta("Avioneta", "IJH-0999", "Comercial"));
        objetosVoladores.add(new Dron("Dron", "GHTY-0987", "Recreativo"));
        objetosVoladores.add(new AvionDeCombate("Avion de combate", "JHGST-876", "Institucional"));

        TorreDeControl torre = new TorreDeControl();
        torre.gestionarAterrizaje(objetosVoladores);
    }
}

