package SaludReto4;

import java.util.Scanner;

public class PersonaReto4 {
    Scanner leer=new Scanner(System.in);
    
    //Atributos

    private String tipoDoc,documento,nombre,apellido,sexo;
    private int edad,peso;
    private Double estatura;

    //1. Metodos constructores

    public PersonaReto4(){}
    
    public PersonaReto4(String tipoDoc, String documento, String nombre, String apellido) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }
   

    //2.Metodos Accesores
    
    public String getTipoDoc() {
        return tipoDoc;
    }


    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    //Metodos propios o personalizados de la clase
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