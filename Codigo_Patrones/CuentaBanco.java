package Proyectos.Codigo_Patrones;

public class CuentaBanco {

    private int salario;
    private String cliente;

    public CuentaBanco(int salario, String cliente) {
        this.salario = salario;
        this.cliente = cliente;
    }

    public void depositar(int i) {
        salario += i;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void sacar(int i) {
        salario -= i;
    }

}
