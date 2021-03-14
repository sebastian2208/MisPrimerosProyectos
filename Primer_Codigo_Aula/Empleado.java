package Proyectos.Primer_Codigo_Aula;

import java.util.Date;

public class Empleado extends Persona {
    protected float salario;

    public Empleado(float salario, int altura, String nombre, Date fechaNacimiento) {
        super(altura,nombre,fechaNacimiento);
        this.salario = salario;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                ", altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
