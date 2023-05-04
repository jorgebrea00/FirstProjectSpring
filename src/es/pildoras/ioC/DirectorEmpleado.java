package es.pildoras.ioC;

public class DirectorEmpleado implements Emplelados {

	// Creacion de campo Creacio Informe

	private CreacionInformes informeNuevo;

	private String email;
	private String nombreEmpresa;

	// CREACION DE CONSTRUCTOR QUE INYECTA LA DEPENDECIA
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion de plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director " + this.informeNuevo.getInforme();
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

}
