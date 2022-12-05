package PrincipalReto2;

import SaludReto2.PersonaReto2;

public class inicioReto2 {

    public static void main(String[] args) {
        PersonaReto2 Wilson=new PersonaReto2();
        String Resultado;
        Double ResultadoIndice;

        Wilson.pedirDatos();

        Wilson.mostrarPersona();

        ResultadoIndice=Wilson.indiceMasaCorporal;

        if (ResultadoIndice<20.0){
            Resultado=Wilson.calcularImc();
            System.out.println(Resultado);
        }
        else if(ResultadoIndice>20.0 && ResultadoIndice<=25.0){
            Resultado=Wilson.calcularImc();
            System.out.println(Resultado);
        }
        else{
            Resultado=Wilson.calcularImc();
            System.out.println(Resultado);
        }

        Wilson.mayorEdad();
  }
}
