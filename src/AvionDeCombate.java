import java.util.Scanner;

// Clase AvionDeCombate
class AvionDeCombate extends Volador implements PuedeAterrizarEnPista2 {
    private boolean autorizacionSolicitada = false;
    private boolean autorizacionConfirmada = false;

    public AvionDeCombate() {
        nombre = "Avion de Combate";
        codigo = "T-01";
        tipo = "Oficial";
    }

    @Override
    public boolean puedeAterrizarEnPista2() {
        if (!autorizacionSolicitada) {
            autorizacionSolicitada = true; // Marcar que la autorización ha sido solicitada
            autorizacionConfirmada = solicitarAutorizacion(); // Guardar el resultado de la autorización
        }

        // Si se ha confirmado la autorización, el avión de combate puede aterrizar en la pista 2
        return autorizacionConfirmada;
    }

    @Override
    public boolean solicitarAutorizacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Autorizar aterrizaje en pista 2 para " + nombre + "? (SI/NO): ");
        String respuesta = scanner.nextLine().trim().toLowerCase(); 
        autorizacionConfirmada = respuesta.equalsIgnoreCase("si"); 
        return autorizacionConfirmada;
    }

    @Override
    public boolean confirmarAutorizacion() {
        autorizacionConfirmada = true;
        return true;
    }
}
