package Proyecto_final;

import java.util.Scanner;

public class Producto {
    public void OptionCompra(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("----Computadores----");
                String[] computadores = {"Laptop", "PC Gamer", "Macbook"};
                double[] preciosComputadores = {25000000, 4000000, 3000000};
                mostrarProductos(computadores, preciosComputadores);
                break;
            case 2:
                System.out.println("----Celulares----");
                String[] celulares = {"iPhone", "Samsung Galaxy", "Huawei"};
                double[] preciosCelulares = {6000000, 5000000, 6500000};
                mostrarProductos(celulares, preciosCelulares);
                break;
            case 3:
                System.out.println("----Consolas----");
                String[] consolas = {"PlayStation", "Xbox", "Nintendo Switch"};
                double[] preciosConsolas = {3000000, 4500000, 2500000};
                mostrarProductos(consolas, preciosConsolas);
                break;
            default:
                System.out.println("Opción inválida. Por favor, elija una opción válida.");
                break;
        }
    }

    private void mostrarProductos(String[] productos, double[] precios) {
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
        }
    }
}
