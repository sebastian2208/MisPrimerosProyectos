package Proyectos.Animacion.vista;

import Proyectos.Animacion.modelo.Figura;

import java.awt.*;

public class DibujoFigura implements IDibujo {
    private Figura objeto;

    public DibujoFigura(Figura f) {
        objeto = f;
    }

    @Override
    public void dibujar(Graphics g) {
        g.drawRect(objeto.getX(), objeto.getY(),
                objeto.getAncho(), objeto.getAlto());
    }
}
