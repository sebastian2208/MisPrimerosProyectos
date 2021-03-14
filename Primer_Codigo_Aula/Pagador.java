package Proyectos.Primer_Codigo_Aula;

public class Pagador implements IPagador {
    public Pagador() {
    }

    public void Pagar(Empleado empleado) {
        int altura = empleado.getAltura();
        if (altura < 160) {
            empleado.setSalario(500);
        }
        if ((altura >= 160) && (altura < 170)) {
            empleado.setSalario(1000);
        }
        if ((altura >= 170) && (altura < 180)) {
            empleado.setSalario(2000);
        }
        if ((altura >= 180) && (altura < 190)) {
            empleado.setSalario(3000);
        }
        if (altura >= 190) {
            empleado.setSalario(3500);
        }
    }
}
