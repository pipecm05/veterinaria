package co.edu.uniquindio.poo;

public record Mascota(String nombre,String identificacion,String especie, String raza, Byte edad ,String genero ,String color,Double peso) {

    /**
     * 
     */
    public Mascota{
        assert nombre != null;
        assert especie != null;
        assert raza != null;
        assert genero != null;
        assert color != null;
        assert raza != "";
        assert color != "";
        assert edad >= (byte)0;
        assert peso >= (byte)0;    
    }

}
