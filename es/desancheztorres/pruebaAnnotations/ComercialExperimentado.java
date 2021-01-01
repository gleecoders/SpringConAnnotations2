package es.desancheztorres.pruebaAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
	// ejecucion de codigo despues de creacion del Bean
	
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creacion del Bean");
	}
	
	// ejecucion de codigo despues de apagado contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destruccion");
	}
	
	public ComercialExperimentado() {
		
	}
	
//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
	
//	@Autowired
//	public void queMasDaElNombre(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}

	@Override
	public String getTareas() {
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInforme() {
//		return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim4")
	private CreacionInformeFinanciero nuevoInforme;

}
