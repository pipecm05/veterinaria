package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Veterinaria {
    private String nombre;

    private Collection <Mascota> mascotas;


    /**
     * Constructor de la clave veterinaria
     * @param nombre
     */
    public Veterinaria(String nombre){
        assert nombre != null;
        this.nombre = nombre;
        mascotas= new LinkedList<>();
    }
    /**
     * Metodo para agregar mascotas
     * @param mascotaveterinaria
     */
    public void agregarMascota(Mascota mascota){
        assert verificarMascotaExiste(mascota.identificacion()) == false;
        mascotas.add(mascota);
    }

    /**
     * Metodo para verificar que el ID de la mascota no se repita en la lista de mascotas
     * @param numID
     * @return existe
     */
    private boolean verificarMascotaExiste(String numID){
        boolean existe= false;
        for (Mascota mascota : mascotas){
            if(mascota.identificacion().equals(numID)){
                existe = true;
            }
        }
        return existe;
    }
    /**
     * Metodo get para obtener el nombre del grupo de mascotas de la veterinaria
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Metodo para obtener la lista de mascotas
     * @return mascotas
     */
    public Collection<Mascota> getMascotas(){
        return mascotas;
    }


}