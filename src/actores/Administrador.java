package actores;

import java.util.List;

import objetos.Bicicleta;
import objetos.Estacion;

public class Administrador {
	
		private int idAdministrador;
	    private String nombre;
	    private String apellidos;
	    private String correoElectronico;
	    private String contraseña;
	    private String nivelPermisos;
	    private String telefono;

	    public Administrador(int idAdministrador, String nombre, String apellidos,
	                         String correoElectronico, String contraseña,
	                         String nivelPermisos, String telefono) {

	        this.idAdministrador = idAdministrador;
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.correoElectronico = correoElectronico;
	        this.contraseña = contraseña;
	        this.nivelPermisos = nivelPermisos;
	        this.telefono = telefono;
	    }

	    public void iniciarSesion() {
	        System.out.println("Administrador logueado");
	    }

	    public void gestionarEstacion(int idEstacion, String accion) {
	        System.out.println("Gestionando estación " + idEstacion);
	    }

	    public void registrarBicicleta(String datosBici) {
	    }

	    public void retirarBicicletaAveriada(int idBicicleta) {
	    }

	    public List<Bicicleta> consultarBicicletasDisponibles(int idEstacion) {
	        return null;
	    }
	    
}
