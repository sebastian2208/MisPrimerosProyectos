package Proyectos.Log4j2_Prueba;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonaLog {

    private final static Logger logger = LogManager.getRootLogger();
    private String nombre;

    public PersonaLog(String nombre) {
        logger.debug("Un objeto de tipo persona ha sido construido");
        this.nombre = nombre;
    }

    public void comer() {
        logger.debug("Llamada a comer");
        System.out.println("Come");
    }
}
