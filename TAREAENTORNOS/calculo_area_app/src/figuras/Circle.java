// Circle.java
package figuras;

import java.util.Scanner;

public class Circle {

    private static Scanner scanner = new Scanner(System.in);

    public static void calculateArea() {
        System.out.print("Ingrese el radio del círculo: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("El área del círculo es: " + area);
    }

    public static void cerrarScanner(){
        scanner.close();
        }
    }

