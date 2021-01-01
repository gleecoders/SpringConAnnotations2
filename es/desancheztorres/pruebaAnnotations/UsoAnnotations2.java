package es.desancheztorres.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		// leer el class de configuracion
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// pedir un bean al contenedor
		
		
//		Empleados empleado = context.getBean("directorFinanciero", Empleados.class);
		
//		System.out.println(empleado.getTareas());
//		System.out.println(empleado.getInforme());
		
		DirectorFinanciero empleado = context.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Email del director: " + empleado.getEmail());
		System.out.println("Nombre de la empresa: " + empleado.getNombreEmpresa());

		System.out.println();

		
		// cerrar el contexto
		context.close();
	}

}
