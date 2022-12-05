package ConceptosPoo;

public class Animal{
    public int edad;


    //Atributos
    public static final String System = null;
    private static String nombre;
    public static void cambiarNombre(String string){
        nombre=string;

       System.out.println("el nuevo nombre actual es "+nombre);
    }
 
        public int calcularEdad(int añoNacimiento){
            edad=2022-añoNacimiento;
            return edad;
        }




    //Metodos

}
