package sena;

import java.util.Scanner;
public class Aprendiz {

    Scanner leer=new Scanner(System.in);

    //Atributos
    public String nombre;
    public String telefono;
    public int edad;
    public String dirección;
    public String Genero;

    String NombreActual="Yurany";



    //Metodos
    public void registraAnimal(){
        System.out.println(" Ingrese la edad ");
        edad=leer.nextInt();

    }

    /*Definir un nombre por defecto 
     * Crear metodo que:
     * muestre el nombre actual
     * solicite el nuevo nombre
    */

    public void cambiarNombre(){
        
     System.out.println(" Su nombre actual es "+NombreActual);

     System.out.println(" Ingrese su nuevo nombre ");
     NombreActual=leer.nextLine();

     System.out.println("su nombre ha sido cambiado exitosamente, su nombre actual ahora es "+NombreActual);
    }

}

