package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {

	

	private Map<TipoDeBeneficiario, Persona> beneficiarios; 
	
	public PolizaAccidentesPersonales(Integer numPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numPoliza, asegurado, sumaAsegurada, prima);
		this.beneficiarios = new HashMap<>();
	}


	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipo) {
		this.beneficiarios.put(tipo, beneficiario);
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return this.beneficiarios.size();
	}

	@Override
	public Persona getAsegurado() {
		return super.getAsegurado();	
	}

	@Override
	public Double getPremio() {
		
		Double premio = getPrima() + (0.20 * getPrima());
		return premio;
	}

}
