package Estructuras_de_control;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer numero ;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par");
        } else
            System.out.println(numero + " es impar");
    }
}
