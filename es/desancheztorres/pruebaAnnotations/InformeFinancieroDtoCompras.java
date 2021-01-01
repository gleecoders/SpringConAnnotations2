package es.desancheztorres.pruebaAnnotations;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe financiero del Departamento de compras del ano 2008";
	}

}
