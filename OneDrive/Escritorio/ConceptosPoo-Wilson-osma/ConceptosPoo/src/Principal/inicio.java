package Principal;

import Salud.Persona;

public class inicio {
    public static void main(String[] args) {
        Persona Wilson=new Persona();

        Wilson.pedirDatos();

        Wilson.mostrarPersona();

        Wilson.calcularImc();

        Wilson.mayorEdad();
    }
}