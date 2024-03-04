package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Prueba para verificar   que el nombre del grupo este correcto
     */
    @Test
    public void datosCompletosVeterinaria(){
        LOG.info("inicio test datosCompletosVeterinaria");
        Veterinaria veterinaria = new Veterinaria ("Amigos peludos");
        assertEquals("Amigos peludos", veterinaria.getNombre());
        LOG.info("fin test datosCompletos");
    
    }
    /**
     * Prueba para verificar que los datos del grupo no esten nulos
     */
    @Test
    public void datosNulosVeterinaria(){
        LOG.info("inicio test datosNulosVeterinaria");
        assertThrows(Throwable.class, ()-> new Veterinaria(null));
        LOG.info("fin test datosNulosVeterinaria");
    }
    /**
     * Prueba para registrar mascotas
     */
    @Test
    public void registrarMascota(){
        LOG.info("inicio test registrarMascotas");
        Veterinaria veterinaria =new Veterinaria("Amigos peludos");
        Mascota mascota= new Mascota ("miguel","123456", "perro", "pincher", (byte) 5, "macho", "negro", (double) 5);
        veterinaria.agregarMascota(mascota);
        assertTrue(veterinaria.getMascotas().contains(mascota));
        assertEquals(1, veterinaria.getMascotas().size());

        LOG.info("fin test registrarMascota");
    }

    /**
     * Prueba para verificar identificacion de una mascota
     */
    @Test
    public void verificarIDMascota(){
        LOG.info("Inicio test verificarIDMascota");
        Veterinaria veterinaria = new Veterinaria("Amigos peludos");

        Mascota mascota1 = new Mascota ("miguel","123456", "perro", "pincher", (byte) 5, "macho", "negro", (double) 5);
        Mascota mascota2 = new Mascota ("quira","123456", "gato", "angora", (byte) 1, "hembra", "blanco", (double) 2);
        veterinaria.agregarMascota(mascota1);

        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota2));

        LOG.info("fin test verificarIdMascota");

    }

}
