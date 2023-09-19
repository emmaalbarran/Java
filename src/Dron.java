import java.util.Scanner;

// Clase Dron
class Dron extends Volador implements PuedeAterrizarEnPista2 {
    private boolean autorizacionSolicitada = false;
    private boolean autorizacionConfirmada = false;

    public Dron() {
        nombre = "Dron";
        codigo = "T-04";
        tipo = "Oficial";
    }

    @Override
    public boolean puedeAterrizarEnPista2() {
        if (!autorizacionSolicitada) {
            autorizacionSolicitada = true; // Marcar que la autorización ha sido solicitada
            autorizacionConfirmada = solicitarAutorizacion(); // Guardar el resultado de la autorización
        }

        // Si se ha confirmado la autorización, el dron puede aterrizar en la pista 2
        return autorizacionConfirmada;
    }

    @Override
    public boolean solicitarAutorizacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Autorizar aterrizaje en pista 2 para " + nombre + "? (SI/NO): ");
        String respuesta = scanner.nextLine().trim().toLowerCase(); 
        return respuesta.equalsIgnoreCase("si"); 
    }

    @Override
    public boolean confirmarAutorizacion() {
        autorizacionConfirmada = true;
        return true;
    }
}




