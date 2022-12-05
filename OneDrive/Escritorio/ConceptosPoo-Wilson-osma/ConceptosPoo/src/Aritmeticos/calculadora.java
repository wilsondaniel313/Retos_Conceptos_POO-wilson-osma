package Aritmeticos;
import java.util.Scanner;
public class calculadora {
    Scanner leer=new Scanner(System.in);
    /*atributos */

    int num1,num2,sumaNumeros,RestaNumeros;
    /*1-Metodos*/
    
    /*2-Metodo sin valor de retorno que sume los dos numeros */

    public void sumanumeros(int num1,int num2){
        System.out.println("ingrese el primer numero"  );
        num1=leer .nextInt();
        System.out.println("ingrese el segundo numero"  );
        num2=leer.nextInt();

        int suma=num1+num2;
        System.out.println("la suma de los numeros"+num1+ "y"+num2+ "Es"+suma  );
    }

    /*2-Metodos con valor de retorno que reste los dos numeros */
    public int restaNumeros(int nu1, int nu2){
        int resta=nu1-num2;
        return resta;
    }

    /*3-Metodo con valor de retorno que devuelva cual es el numero mayor */
    public int  numeroMayor(int num1 , int num2 ) {
        int nummayor;
        if(num1>num2){
            System.out.println("el Numero"+num1+ "Es mayor que el numero"+num2);
        }
        else  if(num2>num1){
            System.out.println("    "  );
        }

    }      

    /*4-Metodo sin valor de retorno que devuelva cual es el numero menor */
    /*5- */
}