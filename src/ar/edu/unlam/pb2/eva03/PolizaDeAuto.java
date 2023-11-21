package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {

	private List<Bien> bienes; 
	
	public PolizaDeAuto(Integer numPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numPoliza, asegurado, sumaAsegurada, prima);
		this.bienes = new ArrayList<>();
	}

	
	@Override
	public void agregarBienAsegurado(Bien bien) {
		this.bienes.add(bien);
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
	public Double getPremio() {
		Double premio = getPrima() + (0.20 * getPrima());
		return premio;
	}






	
}
