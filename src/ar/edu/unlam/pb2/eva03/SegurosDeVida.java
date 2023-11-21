package ar.edu.unlam.pb2.eva03;

public interface SegurosDeVida {

	void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipo);

	Integer obtenerCantidadDeBeneficiarios();

	Persona getAsegurado();

	Double getPremio();

}
