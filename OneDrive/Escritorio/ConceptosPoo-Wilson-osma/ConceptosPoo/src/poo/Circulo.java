package poo;

public class Circulo extends Figura{
    //Atributos
    private final double Pi= 3.14;
    private float Radio;

    //Metodos Accesores
    public float getRadio() {
        return Radio;
    }

    public void setRadio(float radio) {
        this.Radio = radio;
    }

    //Metodos Constructores

    public Circulo(){
    }
    public Circulo(float radio) {
        this.Radio = radio;
    }
    
    //Metodos Propios


    @Override
    public void calcularArea() {
       double ElevacionRadio=Math.pow(Radio,2);
       double area=Pi*ElevacionRadio;

       System.out.println("El area del circulo con radio "+Radio+" es "+area);
        
    }  

}