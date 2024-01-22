// Rectangle.java
package figuras;

import java.util.Scanner;

public class Rectangle {

    private static Scanner scanner = new Scanner(System.in);

    public static void calculateArea() {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double height = scanner.nextDouble();
        double area = base * height;
        System.out.println("El área del rectángulo es: " + area);
    }
    public static void cerrarScanner(){
        scanner.close();
        }
    }
