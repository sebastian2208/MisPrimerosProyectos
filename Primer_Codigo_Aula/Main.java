package Proyectos.Primer_Codigo_Aula;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado(1000, 180, "Vladimir", new Date());
        IPagador pago = new Pagador();
        pago.Pagar(emp);
        System.out.println(emp);
    }
}

