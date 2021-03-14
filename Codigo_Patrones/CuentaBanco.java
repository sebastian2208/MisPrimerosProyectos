package Proyectos.Codigo_Patrones;

import java.beans.PropertyChangeSupport;

public class CuentaBanco {

    private String cliente;
    private int salario;
    private PropertyChangeSupport cambios;

    public CuentaBanco( String cliente, int salario) {
        this.salario = salario;
        this.cliente = cliente;
        cambios = new PropertyChangeSupport(this);
    }

    public void addObserver(PromocionComercial promo) {
        cambios.addPropertyChangeListener(promo);
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + "Salario: " + salario + " Bs";
    }

    public void depositar(int i) {
        int oldSaldo = salario;
        salario += i;

        cambios.firePropertyChange("SALARIO", oldSaldo, salario);
    }

    public void sacar(int i) {
        int oldSaldo = salario;
        salario-= i;

        cambios.firePropertyChange("SALARIO", oldSaldo, salario);
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


}
