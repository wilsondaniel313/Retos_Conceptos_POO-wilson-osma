package SaludReto2;

import java.util.Scanner;

public class PersonaReto2 {
    Scanner leer=new Scanner(System.in);
    
    //Atributos

    public String tipoDoc,documento,nombre,apellido,sexo,pesoTipo;
    public int edad,peso;
    public Double estatura,indiceMasaCorporal;

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
        System.out.println("Los Datos De El Paciente "+nombre+" "+apellido+" Son Los Siguientes:\nTipo De Documento: "+tipoDoc+" \nNumero De Documento: "+documento+"\nEdad: "+edad+" Años \nGenero: "+sexo+" \nPeso: "+peso+" kg \nEstatura "+estatura+" m");
        Double elevaciónEstatura=Math.pow(estatura,2);
        indiceMasaCorporal=peso/elevaciónEstatura;
    }

    public String calcularImc(){
        Double elevaciónEstatura=Math.pow(estatura,2);
        indiceMasaCorporal=peso/elevaciónEstatura;
        
       if (indiceMasaCorporal<20.0){
            pesoTipo="PESOBAJO";
        }
        else if(indiceMasaCorporal>20.0 && indiceMasaCorporal<=25.0){
            pesoTipo="PESOIDEAL";
        }
        else{
            pesoTipo="SOBREPESO";
        }

        return pesoTipo;  
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
