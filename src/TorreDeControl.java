import java.util.List;
import java.util.Scanner;

public class TorreDeControl {
    public void gestionarAterrizaje(List<Volador> voladores) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Respuesta torre de control:");

        for (Volador volador : voladores) {
            if (volador.aterrizarEnPista1()) {
                System.out.println(volador + " Puede aterrizar en la pista 1.");
            } else {
                System.out.println(volador + " Autorizar aterrizaje (SI/NO)?");

                String respuesta = scanner.nextLine().trim().toLowerCase();

                if (respuesta.equals("si")) {
                    System.out.println(volador + " Puede aterrizar en la pista 2.");
                } else {
                    System.out.println("Aterrizaje NO autorizado. No es posible descender.");
                }
            }
        }

        scanner.close();
    }
}