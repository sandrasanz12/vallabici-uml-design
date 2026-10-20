package objetos;

import java.util.List;

public class Estacion {
	 	private int idEstacion;
	    private String nombre;
	    private String direccion;
	    private int capacidadTotal;
	    private int plazasLibres;
	    private String estado;

	    public Estacion(int idEstacion, String nombre, String direccion,
	                    int capacidadTotal, int plazasLibres,
	                    String estado) {

	        this.idEstacion = idEstacion;
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.capacidadTotal = capacidadTotal;
	        this.plazasLibres = plazasLibres;
	        this.estado = estado;
	    }

	    public int consultarPlazasLibres() {
	        return plazasLibres;
	    }

	    public List<Bicicleta> consultarBicicletasDisponibles() {
	        return null;
	    }

	    public void agregarBicicleta(int idBicicleta) {
	        System.out.println("Bicicleta añadida");
	    }

	    public void retirarBicicleta(int idBicicleta) {
	        System.out.println("Bicicleta retirada");
	    }
}
