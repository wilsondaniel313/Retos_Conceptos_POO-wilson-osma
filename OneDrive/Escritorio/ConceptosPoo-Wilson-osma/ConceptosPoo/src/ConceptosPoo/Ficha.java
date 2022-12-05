package ConceptosPoo;

import sena.Aprendiz;
import java.util.Scanner;

public class Ficha {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        Aprendiz laura=new Aprendiz();

        //Asignar un valor al atributo
        laura.edad=22;

        Aprendiz roberth= new Aprendiz();
        roberth.edad=22;

        System.out.println("La edad de esta muchachita es "+laura.edad);

        System.out.println("ingrese la edad");
        roberth.edad=leer.nextInt();

        System.out.println("Ingrese la sede de estudio");
        laura.dirección=leer.next();

        leer.close();
    }
}
