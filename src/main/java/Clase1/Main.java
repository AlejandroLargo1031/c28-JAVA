package Clase1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Double num1 = scanner.nextDouble();
        System.out.println("ingrese un numero");
        Double num2 = scanner.nextDouble();
        System.out.println("ingrese un numero");
        Double num3 = scanner.nextDouble();
        scanner.close();

        Double promedio;
        promedio = (num1 + num2 + num3)/3;
        System.out.println("El promedio es: " + promedio);
    }
}
