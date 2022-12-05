package poo;

public class  Cuadrado extends Figura {
    /*atributos */
    private float lado; 

    /*Metodos Accesores */
    public float getLado (){
        return lado;
    }

    public void setLado(float lado){
        this.lado = lado;
    }

    /*Metodos Constructores */
    public Cuadrado(){
    }

    public Cuadrado(float lado){
        this.lado = lado ;
            }

    /*Metodos Propios */
    @Override
    public void calcularArea() {
        
    }



}