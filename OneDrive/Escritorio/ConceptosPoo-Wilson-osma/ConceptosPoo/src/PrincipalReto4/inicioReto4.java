package PrincipalReto4;

import SaludReto4.Empleado;

public class inicioReto4 {
    public static void main(String[] args) {
        Empleado Wilson=new Empleado("C.C", "1104544674", "Andres", "Castañeda", "Asesor", "Cundinamarca", 50000, 9);

        Wilson.calcularHonorarios();

        Wilson.setNombre("Andres");

        System.out.println("el nombre es "+Wilson.getNombre());
    }
}