/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AgendaTest {
    private static final Logger LOG = Logger.getLogger(AgendaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVaciosContacto() {
        LOG.info("Iniciado test datos vacios contacto");
        assertThrows(Throwable.class,()-> new Contacto(" ", " ", " ", " ", " "));
        LOG.info("Finalizando test datos vacios contacto");
    }

    @Test
    public void valicacionCorreo() {
        LOG.info("Iniciado test valicacionCorreo");
        assertThrows(Throwable.class,()-> new Contacto("Sara", "Saris", "Calarca", "555","sb" ));
        LOG.info("Finalizando test valicacionCorreo");

    }

    @Test
    public void datosVaciosAgenda() {
        LOG.info("Iniciado test datos vacios Agenda");
        assertThrows(Throwable.class,()-> new Agenda(" "));
        LOG.info("Finalizando test datos vacios Agenda");

    }

    @Test
    public void datosVaciosGrupo() {
        LOG.info("Iniciado test datos vacios grupo");
        assertThrows(Throwable.class,()-> new Grupo(" ", null));
        LOG.info("Finalizando test datos vacio grupo");

    }

    @Test
    public void datosVaciosReunion() {
        LOG.info("Iniciado test datos vacios reunion");
        assertThrows(Throwable.class,()-> new Reunion(" ", null, null));
        LOG.info("Finalizando test datos vacio reunion");

    }
}
