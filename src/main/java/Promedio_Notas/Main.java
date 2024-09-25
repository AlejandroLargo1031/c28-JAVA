package Promedio_Notas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Double nota1 = scanner.nextDouble();
        System.out.println("ingrese un numero");
        Double nota2 = scanner.nextDouble();
        System.out.println("ingrese un numero");
        Double nota3 = scanner.nextDouble();
        scanner.close();

        Double[] notas = new Double[3];

        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;

        System.out.println( (notas[0]+ notas[1] + notas[2]) / 3 );

    }
}
