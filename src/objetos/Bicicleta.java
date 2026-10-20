package objetos;

import java.time.LocalDate;

public class Bicicleta {
		private int idBicicleta;
	    private String codigoIdentificativo;
	    private String estado;
	    private LocalDate fechaAlta;

	    public Bicicleta(int idBicicleta, String codigoIdentificativo,
	                     String estado, LocalDate fechaAlta) {

	        this.idBicicleta = idBicicleta;
	        this.codigoIdentificativo = codigoIdentificativo;
	        this.estado = estado;
	        this.fechaAlta = fechaAlta;
	    }

	    public void desbloquear() {
	        System.out.println("Bicicleta desbloqueada");
	    }

	    public void bloquear() {
	        System.out.println("Bicicleta bloqueada");
	    }

	    public void cambiarEstado(String nuevoEstado) {
	        this.estado = nuevoEstado;
	    }
}
