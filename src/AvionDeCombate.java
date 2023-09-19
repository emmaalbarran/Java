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
            // Si la autorización no se ha solicitado, solicítela
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
        String respuesta = scanner.nextLine().trim().toLowerCase(); // Convertir la respuesta a minúsculas
        autorizacionConfirmada = respuesta.equalsIgnoreCase("si"); // Utilizar equalsIgnoreCase para comparar
        return autorizacionConfirmada;
    }

    @Override
    public boolean confirmarAutorizacion() {
        // Aquí puedes implementar la lógica para confirmar la autorización por parte del operario
        // Devuelve true si se confirma, false si se deniega (aunque en este caso, no se utilizaría)
        // Por ejemplo, puedes simular la confirmación automáticamente
        autorizacionConfirmada = true;
        return true;
    }
}
