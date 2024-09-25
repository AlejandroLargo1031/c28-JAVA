package Herencias;

import com.sun.source.tree.Tree;
import com.sun.source.tree.UsesTree;

public class Gato extends Animal{
    String color;
    String pelaje;

    public Gato(String especie,Integer peso,String habitad,String color,String pelaje){
        this.especie = especie;
        this.peso = peso;
        this.habitad = habitad;
        this.color = color;
        this.pelaje = pelaje;
    };

    public void setColor(String color) {
        this.color = color;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getColor() {
        return color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void mostrarAnimal(){
        System.out.println(  " Especie: " + especie + " Peso: " + peso
                + " Habilidad: " + habitad + " Color: " + color + " Pelaje: " + pelaje);
    }
}
