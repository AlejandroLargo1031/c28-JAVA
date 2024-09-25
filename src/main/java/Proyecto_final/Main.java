package Proyecto_final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Bienvenido al Menu----");
        System.out.println("----Digite una opcion a elegir----");
        System.out.println("----1. Computadores----");
        System.out.println("----2. Celulares----");
        System.out.println("----3. Consolas----");
        Integer option = scanner.nextInt();

        Producto producto = new Producto();
        producto.OptionCompra(option);
    }
}
