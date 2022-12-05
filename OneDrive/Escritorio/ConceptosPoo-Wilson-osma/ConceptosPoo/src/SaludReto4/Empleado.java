package SaludReto4;

import java.util.Scanner;

public class Empleado extends PersonaReto4{

    Scanner leer=new Scanner(System.in);
    //Atributos
    private String cargo,departamento;
    private int valorHora,horasTrabajadas;

    //Metodos Constructores

    public Empleado(){}
    

    public Empleado(String tipoDoc, String documento, String nombre, String apellido, String cargo, String departamento,
        int valorHora, int horasTrabajadas) {
        super(tipoDoc, documento, nombre, apellido);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }


    //Metodos Accesores
    public String getCargo() {
        return cargo;
    }


    public String getDepartamento() {
        return departamento;
    }

    public int getValorHora() {
        return valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    
    

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //Metodos
    public void calcularHonorarios(){

        int valorTotal=(valorHora*horasTrabajadas);
        Double porcentaje= (0.00966*valorTotal);  Double valorTotalHonorarios=valorTotal-porcentaje;

        System.out.println("El Empleado "+getNombre()+" "+getApellido()+" tiene los siguientes datos:\n Tipo De Documento: "+getTipoDoc()+" \n Numero De Documento: "+getDocumento()+"\n Cargo: "+this.cargo+"\n Horas Trabajadas: "+this.horasTrabajadas+"\n Valor Por Hora: "+this.valorHora+"\nSe la pagara un total de "+valorTotalHonorarios+" Mil Pesos");
    }
}