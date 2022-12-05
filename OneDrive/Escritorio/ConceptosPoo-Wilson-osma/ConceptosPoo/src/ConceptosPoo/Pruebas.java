package ConceptosPoo;

import java.util.Scanner;

import sena.Aprendiz;

public class Pruebas {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        Aprendiz Alumno=new Aprendiz();
        System.out.println("ingrese su nombre");
        Alumno.nombre=leer.nextLine();

        System.out.println("ingrese su numero de telefono");
        Alumno.telefono=leer.nextLine();

        System.out.println("ingrese su genero");
        Alumno.Genero=leer.nextLine();

        System.out.println("ingrese su dirección");
        Alumno.dirección=leer.nextLine();

        System.out.println("ingrese su edad");
        Alumno.edad=leer.nextInt();

        System.out.println("El alumno que se incribio a nuestra institución se llama "+Alumno.nombre+" y sus datos personales son: \n numero de telefono: "+Alumno.telefono+"\n genero: "+Alumno.Genero+"\n dirección: "+Alumno.dirección+"\n Edad: "+Alumno.edad);

        leer.close();
    }
}
