package Salud;

import java.util.Scanner;

public class Persona {
    Scanner leer=new Scanner(System.in);
    
    //Atributos

    public String tipoDoc,documento,nombre,apellido,sexo;
    public int edad,peso;
    public Double estatura;

    //Metodos
    public void pedirDatos(){
        System.out.println("Ingrese Su Tipo De Documento");
        tipoDoc=leer.nextLine();

        System.out.println("Ingrese Su Numero De Documento");
        documento=leer.nextLine();

        System.out.println("Ingrese Su Nombre ");
        nombre=leer.nextLine();

        System.out.println("Ingrese Su Apellido");
        apellido=leer.nextLine();

        System.out.println("Ingrese Su Genero");
        sexo=leer.nextLine();

        System.out.println("Ingrese Su Edad ");
        edad=leer.nextInt();

        System.out.println("Ingrese Su peso ");
        peso=leer.nextInt();

        System.out.println("Ingrese Su Estatura");
        estatura=leer.nextDouble();
    }

    public void mostrarPersona(){
        System.out.println("Los Datos De El Paciente "+nombre+" "+apellido+" Son Los Siguientes:\n Tipo De Documento: "+tipoDoc+" \n Numero De Documento: "+documento+"\n Edad: "+edad+" Años \n Genero: "+sexo+" \n Peso: "+peso+" kg \n Estatura "+estatura+" m");
    }

    public void calcularImc(){
        Double elevaciónEstatura=Math.pow(estatura,2);
        Double indiceMasaCorporal=peso/elevaciónEstatura;

        System.out.println(" Su Indice De Masa Corporal Es "+indiceMasaCorporal);

        if (indiceMasaCorporal<20.0){
            System.out.println("Por Lo Tanto, Su Peso Esta Por Debajo De Lo Ideal");
        }
        else if(indiceMasaCorporal>20.0 && indiceMasaCorporal<=25.0){
            System.out.println("Por Lo Tanto, Su Peso Es Ideal");
        }
        else if(indiceMasaCorporal>25.0){
            System.out.println("Por Lo Tanto, Usted Sufre De Sobrepeso");
        }
        else{
            System.out.println("Siga Las Instrucciones");
        }

    }

    public void mayorEdad(){
        System.out.println("La Edad Que Usted Digito Es "+edad+" Años");

        if(edad>=18){
            System.out.println("Por Lo Tanto, Usted Es Mayor De Edad, Ya Puede Irse");
        }
        else{
            System.out.println("Por Lo Tanto, Usted En Menor De Edad, Para Poder Salir Tiene Que Llamar A Su Acompañante");
        }
    }
}
