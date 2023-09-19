import java.util.Scanner;

// Interfaz para objetos que pueden aterrizar en pista 2 y solicitar autorización
interface PuedeAterrizarEnPista2 {
    boolean puedeAterrizarEnPista2();
    boolean solicitarAutorizacion();
    boolean confirmarAutorizacion();
}
