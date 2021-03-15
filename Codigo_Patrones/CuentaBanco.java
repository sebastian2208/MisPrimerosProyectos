package Proyectos.Codigo_Patrones;

import java.beans.PropertyChangeSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CuentaBanco {
    private static final Logger logger = LogManager.getRootLogger();
    private String cliente;
    private int saldo;
    private PropertyChangeSupport cambios;

    public CuentaBanco( String cliente, int saldo) {
        this.saldo = saldo;
        this.cliente = cliente;
        cambios = new PropertyChangeSupport(this);
        logger.info("Se esta creando un objeto de tipo cuenta para un banco");
    }

    public void addObserver(PromocionComercial promo) {
        cambios.addPropertyChangeListener(promo);
    }

    @Override
    public String toString() {
        logger.info("Aqui retornamos el objeto creado mostrando los datos de la cuenta");
        return "Cliente: " + cliente + "Saldo: " + saldo + " Bs";
    }

    public void depositar(int i) {
        int oldSaldo = saldo;
        saldo += i;

        cambios.firePropertyChange("saldo", oldSaldo, saldo);
        logger.info("Aqui depositamos el saldo a nuestra cuenta y notificamos al observer");
    }

    public void sacar(int i) {
        int oldSaldo = saldo;
        saldo -= i;

        cambios.firePropertyChange("saldo", oldSaldo, saldo);
        logger.info("Aqui sacamos dinero de nuestra cuenta y notificamos al observer");
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


}
