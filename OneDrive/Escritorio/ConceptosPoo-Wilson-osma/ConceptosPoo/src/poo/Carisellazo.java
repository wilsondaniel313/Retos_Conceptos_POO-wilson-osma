package poo;
import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements juego{

    //Atributos
    private String nombre;
    private int eleccion;
    private int moneda;

    Scanner leer=new Scanner(System.in);
    @Override
    public void iniciar() {
       System.out.println("Ingrese el nombre del jugador");
       nombre=leer.nextLine();
        
    }

    @Override
    public void jugar() {
       System.out.println(" Escoge 1 para Cara o 2 para Sello");
        eleccion=leer.nextInt();
        System.out.println("...Moneda Girando....");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
    }

    @Override
    public void finalizar() {
        if(moneda==1 && eleccion==1){
            System.out.println("Salio Cara, escogiste cara....Ganaste "+nombre);
        }
        else if (moneda==1 && eleccion==2){
            System.out.println("Salio Cara, escogiste sello....Perdiste "+nombre);
        }
        else if (moneda==2 && eleccion==2){
            System.out.println("Salio Sello, escogiste sello....Ganaste "+nombre);
        }
        else if (moneda==2 && eleccion==1){
            System.out.println("Salio Sello, escogiste cara....Perdiste "+nombre);
        }
        
    }
    
}
