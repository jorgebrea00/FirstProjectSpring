package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//Creacion de objetos de tioo empleados
		
		Emplelados empleado1 = new DirectorEmpleado();
		
		//uso objeros
		
		System.out.println(empleado1.getTareas());
		*/
		
		//abrimos en xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);
		
	
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		//*********************
		
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(maria.getTareas());
		
		System.out.println(maria.getInforme());
		
		System.out.println(maria.getEmail());
		System.out.println(maria.getNombreEmpresa());
		SecretarioEmpleado pablo = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(pablo.getEmail());
		contexto.close();
		
		

		
	}

}
