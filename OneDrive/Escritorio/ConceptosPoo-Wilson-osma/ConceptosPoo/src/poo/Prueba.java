package poo;

import java.util.Scanner;

public class Prueba {
    public static void main(String [] args){
        String Repetir="s";
        Scanner leer=new Scanner (System.in);
        float valorLado,valorAltura,valorBase,Radio;

        Cuadrado CalculadoraAreas=new Cuadrado();
        Triangulo CalculadoraAreas2=new Triangulo ();
        Rectangulo CalculadoraAreas3=new Rectangulo();
        Circulo  CalculadoraAreas4=new Circulo ();

        while(Repetir.equals("s"));
         System.out.println("A cual figura geometrica desea calcular el area: \n 1. Cuadrado \n 2. Rectangulo \n  3.Triangulo \n 4.Circulo ");
         int opcionesAreas=leer.nextInt();

         switch (opcionesAreas )
         {
            case 1:
                System.out.println("Escriba el lado del cuadrado");
                valorLado=leer.nextFloat();
                CalculadoraAreas.setLado(valorLado);
                CalculadoraAreas.calcularArea();
            break;
         
            case 2:
                System.out.println("Escriba la altura del Triangulo");
                valorAltura=leer.nextFloat();
                CalculadoraAreas2.setAltura(valorAltura);
                System.out.println("Escriba la Base del Triangulo");
                valorBase=leer.nextFloat();
                CalculadoraAreas2.setBase(valorBase);
                CalculadoraAreas2.calcularArea();
            break;

            case 3:
             System.out.println("Escriba la altura del Rectangulo ");
                valorAltura=leer.nextFloat();
                CalculadoraAreas3.setAltura(valorAltura);
             System.out.println("Escriba la base del rectangulo ");
                valorAltura=leer .nextFloat();
                CalculadoraAreas3.setBase(valorBase);
                CalculadoraAreas2.setAltura(valorAltura);
                break;
            case 4:
                System.out.println("Escriba el radio del circulo ");
                Radio=leer.nextFloat();
                CalculadoraAreas4.setRadio(Radio);
                CalculadoraAreas4.calcularArea();
            break;
            
          
        }
        leer.close();
    }
}