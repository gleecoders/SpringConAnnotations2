package es.desancheztorres.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		// leer el class de configuracion
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// pedir un bean al contenedor
		Empleados Cristian = context.getBean("comercialExperimentado", Empleados.class);
		Empleados Oscar = context.getBean("comercialExperimentado", Empleados.class);
		
		// apuntan al mismo objeto de memoria?
		if(Cristian == Oscar) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Cristian + "\n" + Oscar);
		} else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Cristian + "\n" + Oscar);
		}
		
		
		context.close();
	}

}
