package poo;

public class  Triangulo extends Figura{
    /*actributos */
    private float base,altura; 

    /*metodos accesores */

    public float getBase (){
        return base;
    }

    public float getAltura (){
        return altura;
    }

    public void setBase(float base){
        this.base = base;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    /*Metodos Constructores */
    public Triangulo(){
    }

    public Triangulo(float base,float altura){
        this.base = base ;
        this.base =altura;
     }

    /*Metodos Propios */
  

    @Override
    public void calcularArea() {
       float area=(base*altura)/2;
       System.out.println("el area de Triangulo con base "+base+"y altura" +altura+"es"+area);
        
    }


}
