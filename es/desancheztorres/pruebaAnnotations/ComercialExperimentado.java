package es.desancheztorres.pruebaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
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
