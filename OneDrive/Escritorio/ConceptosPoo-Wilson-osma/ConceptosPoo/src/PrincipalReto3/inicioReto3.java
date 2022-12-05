package PrincipalReto3;

import SaludReto3.PersonaReto3;

public class inicioReto3{
    public static void main(String[] args) {
        PersonaReto3 Usuario=new PersonaReto3();
        PersonaReto3 Usuario2=new PersonaReto3("C.C", "1104544674", "Camilo", "Amaya", "Masculino", 18, 48, null);

        Usuario.mostrarDatos();
        Usuario.mostrarDatos("Ricardo", "Castañeda");

        Usuario2.mostrarDatos();

    }
}
