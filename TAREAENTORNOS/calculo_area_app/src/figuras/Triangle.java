// Triangle.java
package figuras;

import java.util.Scanner;

public class Triangle {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void calculateArea() {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("El área del triángulo es: " + area);
    }
    public static void cerrarScanner(){
        scanner.close();
        }
}