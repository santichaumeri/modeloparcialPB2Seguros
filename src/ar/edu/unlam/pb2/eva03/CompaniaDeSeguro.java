package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CompaniaDeSeguro {

	private Set<Poliza> polizas;

	public CompaniaDeSeguro(String nombre) {

		this.polizas = new HashSet<>();

	}

	public void agregarPoliza(Poliza poliza) {
		this.polizas.add(poliza);

	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return this.polizas.size();
	}

	public void denunciarSiniestro(Integer numeroDePoliza) throws PolizaInexistenteException {
		
		Poliza poliza = this.getPoliza(numeroDePoliza); 
		
		if (poliza == null) {
			throw new PolizaInexistenteException();
		}
		
		poliza.getAsegurado().setPagoPorSiniestro(poliza.getSumaAsegurada());
		
		if (poliza instanceof SegurosGenerales) {
			poliza.getAsegurado().setRobado(true);
		}else
			poliza.getAsegurado().setAccidentado(true);
		
	}

	public Poliza getPoliza(Integer numeroDePoliza) {
		
		for (Poliza poliza : polizas) {
			if (poliza.getNumPoliza().equals(numeroDePoliza)) {
				return poliza;
			}
		}

		return null;
	}

}
