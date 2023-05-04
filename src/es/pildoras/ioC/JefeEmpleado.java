package es.pildoras.ioC;

public class JefeEmpleado implements Emplelados {

	private CreacionInformes informeNuevo;
	
	
	
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado con el jefe con arreglos"+ informeNuevo.getInforme();
	}
	
	
}
