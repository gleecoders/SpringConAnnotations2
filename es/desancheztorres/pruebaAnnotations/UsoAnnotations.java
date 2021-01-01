package es.desancheztorres.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		// leer el xml de configuracion
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// pedir un bean al contenedor
		Empleados Cristian = context.getBean("comercialExperimentado", Empleados.class);
		
		// usar el bean
		System.out.println(Cristian.getTareas());
		System.out.println(Cristian.getInforme());
		
		// cerrar el contexto
		context.close();
	}

}
