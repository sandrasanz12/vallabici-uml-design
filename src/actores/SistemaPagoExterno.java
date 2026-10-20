package actores;

public class SistemaPagoExterno {
	
	 private int idSistemaPago;
	    private String nombreSistema;
	    private boolean estadoConexion;
	    private String urlServicio;
	    private String metodoPago;

	    public SistemaPagoExterno(int idSistemaPago, String nombreSistema,
	                              boolean estadoConexion, String urlServicio,
	                              String metodoPago) {

	        this.idSistemaPago = idSistemaPago;
	        this.nombreSistema = nombreSistema;
	        this.estadoConexion = estadoConexion;
	        this.urlServicio = urlServicio;
	        this.metodoPago = metodoPago;
	    }

	    public boolean procesarPago(double cantidad) {
	        System.out.println("Procesando pago...");
	        return true;
	    }

	    public boolean validarOperacion(int idOperacion) {
	        return true;
	    }
	
}
