package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Poliza {
	
	private Integer numPoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	
	public Poliza(Integer numPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numPoliza = numPoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
	}

	public Integer getNumPoliza() {
		return numPoliza;
	}

	public void setNumPoliza(Integer numPoliza) {
		this.numPoliza = numPoliza;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public Double getPrima() {
		return prima;
	}

	public void setPrima(Double prima) {
		this.prima = prima;
	}
	public boolean tuvoAlgunAccidente() {
		
		if (this.asegurado.getAccidentado()) {
			return true;
		}
		return false;
	}
	
	public Boolean fueRobado() {
		
		if (this.asegurado.getRobado()) {
			return true;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numPoliza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Poliza other = (Poliza) obj;
		return Objects.equals(numPoliza, other.numPoliza);
	}



	

}
