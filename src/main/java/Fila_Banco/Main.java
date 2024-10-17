package Fila_Banco;

public class Main {
    public static void main(String[] args) {
        //Arreglo a ordenar
        String[] personas = {"Lucas", "Valeria", "Mateo",
                "Camila", "Alejandro", "Sofía",
                "Sebastián", "Mariana", "Daniel",
                "Fernanda"
        };
        //Posicion donde se inserta el elemento a ordenar
        int pos;
        // Valor del elemento a ordenar
        String valor;

        for (int i = 1; i < personas.length; i++) {
            pos = i;
            valor = personas[i];

            //Uso de el metodo compareTo para comparar el valor unicode de los Strings
            while (pos > 0 && valor.compareTo(personas[pos - 1]) < 0) {
                personas[pos] = personas[pos - 1];
                pos = pos - 1;
            }//Fin del while
            //Insertamos el valor en la posicion indicada
            personas[pos] = valor;
        }//Fin del for

        //mostramos el arreglo
        System.out.println("Personas ordenadas alfabéticamente:");
        for (String persona : personas) {
            System.out.println(persona);;
        }//fin del for
    }
    }

