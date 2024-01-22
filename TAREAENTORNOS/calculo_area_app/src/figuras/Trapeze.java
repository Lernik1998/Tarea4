package figuras;

import java.util.Scanner;

public class Trapeze {

    private static Scanner scanner = new Scanner(System.in);

    public static void calculateArea() {
     
        // Ingresar las longitudes de las bases y la altura
        System.out.print("Ingrese la longitud de la base 1: ");
        double base1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud de la base 2: ");
        double base2 = scanner.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();

        // Calcular el área del trapecio
        double area = calcularAreaTrapecio(base1, base2, altura);

        // Mostrar el resultado
        System.out.println("El área del trapecio es: " + area);
    }

    // Método para calcular el área del trapecio
    public static double calcularAreaTrapecio(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }

    public static void cerrarScanner(){
        scanner.close();
}
}
