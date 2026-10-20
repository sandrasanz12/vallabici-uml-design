package actores;

public class PersonalMantenimiento {
	
	private int idMantenimiento;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correoElectronico;
    private String estadoDisponibilidad;
    private String zonaAsignada;

    public PersonalMantenimiento(int idMantenimiento, String nombre,
                                 String apellidos, String telefono,
                                 String correoElectronico,
                                 String estadoDisponibilidad,
                                 String zonaAsignada) {

        this.idMantenimiento = idMantenimiento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estadoDisponibilidad = estadoDisponibilidad;
        this.zonaAsignada = zonaAsignada;
    }

    public void recibirAviso(int idIncidencia) {
        System.out.println("Aviso recibido");
    }

    public void marcarComoReparada(int idBicicleta) {
        System.out.println("Bicicleta reparada");
    }

    public void revisarBicicleta(int idBicicleta) {
    }
    
}
