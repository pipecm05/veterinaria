/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    
     @Test
     public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        final Mascota mascota = new Mascota("miguel", "perro", "pincher", (byte) 5, "macho", "negro", (double) 5);
        
        assertEquals("miguel", mascota.nombre());
        assertEquals("perro", mascota.especie());
        assertEquals("pincher", mascota.raza());
        assertEquals((byte) 5, mascota.edad());
        assertEquals("macho", mascota.genero());
        assertEquals("negro", mascota.color());
        assertEquals((double)5, mascota.peso());

        LOG.info("Finalizando test datos completos");
    }
    @Test
    public void datosNulos(){
        LOG.info("Iniciado test datos nulos");
        assertThrows(Throwable.class, () -> new Mascota(null, null, null, null, "macho", null, (double) 5));

        LOG.info("Finalizando test datos nulos");
    }
    @Test
    public void datosVacios(){
        LOG.info("Iniciado test datos vacios");
        assertThrows(Throwable.class, () -> new Mascota("miguel", "perro", "", (byte) 5, "macho", "", (double) 5));
        LOG.info("Finalizando test datos vacios");
    }
    @Test
    public void cantidadesNegativas(){
        LOG.info("Iniciado test cantidades negativas");
        assertThrows(Throwable.class, () -> new Mascota("miguel", "perro", "pincher", (byte) -5, "macho", "negro", (double) -5));
        LOG.info("Finalizando test cantidades negativas");
    }
}
