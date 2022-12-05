package Reto5;

import java.util.Scanner;

import poo.juego;

public class EsquemaJuego implements juego {

    //Atributos
    private String nombre;
    private int eleccion;
    private int computadora;

    Scanner leer= new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.println("Bienvenido Al Juego De Piedra-Papel-Tijera, Tu Contrincante Sera La Maquina");
        System.out.println("Ingrese el nombre del jugador");
        nombre=leer.nextLine();
    }

    @Override
    public void jugar() {
        computadora = (int)(Math.random() * 3) + 1;
        System.out.println("La Maquina Ya Escogio Que Sacara....");
 
        System.out.print("Es Tu Turno, Escoge\n 1. Piedra \n 2. Papel \n 3. Tijeras\n ");
        eleccion= leer.nextInt();   
    }

    @Override
    public void finalizar() {
        System.out.print("La computadora habia escogido: ");
        switch ( computadora )
        {
            case 1:
                System.out.println("Piedra");
                switch ( eleccion )
                {
                   case 1: System.out.println("Empate!..., Ambos Eligieron Piedra"); break;
                   case 2: System.out.println("Ganaste "+nombre+"!..., Papel Gana Contra Piedra"); break;
                   case 3: System.out.println("La Computadora Gana!..., Piedra Gana Contra Tijeras"); break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( eleccion )
                {
                   case 1: System.out.println("La Computadora Gana!..., Papel Gana Contra Piedra"); break;
                   case 2: System.out.println("Empate!..., Ambos Eligieron Papel"); break;
                   case 3: System.out.println("Ganaste "+nombre+"!..., Tijeras Gana Contra Papel"); break;
                }
                break;
 
            case 3:
                System.out.println("Tijeras");
                switch ( eleccion )
                {
                   case 1: System.out.println("Ganaste "+nombre+"!..., Piedra Gana Contra Tijeras"); break;
                   case 2: System.out.println("La Computadora Gana!..., Tijeras Gana Contra Papel"); break;
                   case 3: System.out.println("Empate!..., Ambos Eligieron Tijeras"); break;
                }
                break;
        }
        
    }
    
}
