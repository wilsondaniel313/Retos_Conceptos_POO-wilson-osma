package sena;

import ConceptosPoo.Animal;

public class Prueba {
    public static void main(String[] args) {
       Animal juancamilo=new Animal();
        Animal.cambiarNombre("copito");

        juancamilo.calcularEdad(2015);
        System.out.println("la edad del animal es "+juancamilo);
    }
}
   