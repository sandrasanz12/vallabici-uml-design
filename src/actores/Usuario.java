package actores;

import java.time.LocalDate;
import java.util.List;

import objetos.Bicicleta;
import objetos.Estacion;

public class Usuario {
	
		private int idUsuario;
	    private String nombre;
	    private String apellidos;
	    private String DNI;
	    private String correoElectronico;
	    private String contraseña;
	    private double saldo;
	    private String telefono;
	    private LocalDate fechaRegistro;
	    private String estadoCuenta;

	    public Usuario(int idUsuario, String nombre, String apellidos, String DNI,
	                   String correoElectronico, String contraseña, double saldo,
	                   String telefono, LocalDate fechaRegistro, String estadoCuenta) {

	        this.idUsuario = idUsuario;
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.DNI = DNI;
	        this.correoElectronico = correoElectronico;
	        this.contraseña = contraseña;
	        this.saldo = saldo;
	        this.telefono = telefono;
	        this.fechaRegistro = fechaRegistro;
	        this.estadoCuenta = estadoCuenta;
	    }

	    public void registrarse() {
	        System.out.println("Usuario registrado correctamente");
	    }

	    public double consultarSaldo() {
	        return saldo;
	    }

	    public void iniciarSesion() {
	    }

	    public List<Estacion> consultarEstaciones() {
	        return null;
	    }

	    public void recargarSaldo(double cantidad) {
	    }

	    public void alquilarBicicleta(int idBicicleta) {
	    }

	    public void devolverBicicleta(int idEstacion) {
	    }

	    public void reportarAveria(String descripcion) {
	    }

	    public List<Bicicleta> consultarBicicletasDisponibles(int idEstacion) {
	        return null;
	    }
}
