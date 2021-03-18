package Proyectos.Animacion.gui;

import Proyectos.Animacion.modelo.Figura;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PanelPosicion extends JPanel implements PropertyChangeListener {
    private Figura modelo;
    private JLabel posicionLabel;

    private static final long serialVersionUID = 1L;

    public PanelPosicion(Figura f) {
        modelo = f;

        init();
    }

    private void init() {
        posicionLabel = new JLabel();
        this.setLayout(new BorderLayout());
        this.add(posicionLabel, BorderLayout.CENTER);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        posicionLabel.setText("Posicion X,Y: " + modelo.getX() + "," + modelo.getY());
    }
}
