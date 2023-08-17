import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        if (validarDia(dia, mes, anio) && validarMes(mes) && validarAnio(anio)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        scanner.close();

    }

    public static int calcularDiasDelMes(int mes, int anio) {
        if (mes == 2) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                return 29; // Año bisiesto
            } else {
                return 28; // Año no bisiesto
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30; // Meses con 30 días
        } else {
            return 31; // Meses con 31 días
        }
    }

    public static boolean validarDia(int dia, int mes, int anio) {
    int diasMes = calcularDiasDelMes(mes, anio);
    return dia >= 1 && dia <= diasMes;
    }

    public static boolean validarMes(int mes) {
        return mes >= 1 && mes <= 12;
    }

    public static boolean validarAnio(int anio) {
        return anio >= 1900 && anio <= 2099;
    }
}
