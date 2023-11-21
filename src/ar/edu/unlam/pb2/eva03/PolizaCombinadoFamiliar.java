package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida, SegurosGenerales {

	private List<Bien> bienes;
	private Map<TipoDeBeneficiario, Persona> beneficiarios;

	public PolizaCombinadoFamiliar(Integer numPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numPoliza, asegurado, sumaAsegurada, prima);
		// TODO Auto-generated constructor stub

		this.bienes = new ArrayList<>();
		this.beneficiarios = new HashMap<>();
	}

	@Override
	public void agregarBienAsegurado(Bien bien) {
		this.bienes.add(bien);
	}

	@Override
	public Integer getNumPoliza() {
		return super.getNumPoliza();
	}

	@Override
	public Bien getAuto() {
		for (Bien bien : bienes) {

			if (bien instanceof Auto) {
				return bien;
			}
		}
		return null;
	}

	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipo) {
		this.beneficiarios.put(tipo, beneficiario);
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return this.beneficiarios.size();
	}

	@Override
	public Persona getAsegurado() {
		// TODO Auto-generated method stub
		return super.getAsegurado();
	}

	@Override
	public Double getPremio() {
		Double premio = getPrima() + (0.20 * getPrima());
		return premio;
	}

}
