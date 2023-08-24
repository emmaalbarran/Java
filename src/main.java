import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt(); // Pide la cantidad de alumnos
        scanner.nextLine(); // Salto de línea

        // Se crean arrays con los datos de cada alumno
        String[] nombres = new String[cantidadAlumnos];
        String[] apellidos = new String[cantidadAlumnos];
        int[] notasTeoricas = new int[cantidadAlumnos];
        int[] notasPracticas = new int[cantidadAlumnos];
        int[] notaFinal = new int[cantidadAlumnos];

        // Pide los mismos datos para cada alumno, la cantidad de veces que los pide depende de cantidadAlumnos
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno: ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese el apellido del alumno: ");
            apellidos[i] = scanner.nextLine();

            System.out.print("Ingrese nota practica: ");
            notasPracticas[i] = scanner.nextInt();

            System.out.print("Ingrese nota teorica: ");
            notasTeoricas[i] = scanner.nextInt();
            scanner.nextLine(); // Salto de línea

            notaFinal[i] = (notasTeoricas[i] + notasPracticas[i]) / 2; // Calcula nota final de cada alumno

            System.out.println();
        }

        scanner.close();

        // Encontrar la nota mas alta y mas baja
        int maxNota = notaFinal[0];
        int alumnoMaxNota = 0;

        int minNota = notaFinal[0];
        int alumnoMinNota = 0;

        for (int i = 1; i < cantidadAlumnos; i++) {
            if (notaFinal[i] > maxNota) {
                maxNota = notaFinal[i];
                alumnoMaxNota = i;
            }

            if (notaFinal[i] < minNota) {
                minNota = notaFinal[i];
                alumnoMinNota = i;
            }
        }

        System.out.println("Alumno con la nota más alta: ");
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (notaFinal[i] == maxNota) { // Si hay mas de 1 con la nota mas alta los muestra todos
                System.out.println("Nombre: " + nombres[i] + " " + apellidos[i]);
                System.out.println("Nota final: " + maxNota);
                System.out.println();
            }
        }

        System.out.println("Alumno con la nota más baja:");
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (notaFinal[i] == minNota) { // Si hay mas de 1 con la nota mas baja los muestra todos
                System.out.println("Nombre: " + nombres[i] + " " + apellidos[i]);
                System.out.println("Nota final: " + minNota);
                System.out.println();
            }
        }

        System.out.println("Alumnos con promedio mayor o igual a 7: ");
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (notaFinal[i] >= 7) { // Muestra a todos los alumnos con promedio mayor o igual a 7
                System.out.println("Nombre: " + nombres[i] + " " + apellidos[i]);
                System.out.println("Promedio: " + notaFinal[i]);
                System.out.println();
            }
        }

        System.out.println("Alumnos con promedio menor a 7:");
        for (int i = 0; i < cantidadAlumnos; i++) { 
            if (notaFinal[i] < 7) { // Muestra todos los alumnos con nota menor a 7 
                System.out.println("Nombre: " + nombres[i] + " " + apellidos[i]);
                System.out.println("Promedio: " + notaFinal[i]);
                System.out.println();
            }
        }
    }
}