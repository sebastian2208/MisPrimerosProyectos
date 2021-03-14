package Proyectos.Primer_Codigo_Aula;

import java.util.Date;

public class Persona {
    protected int altura;
    protected String nombre;
    protected Date fechaNacimiento;

    public Persona(int altura, String nombre, Date fechaNacimiento) {
        this.altura = altura;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
}
