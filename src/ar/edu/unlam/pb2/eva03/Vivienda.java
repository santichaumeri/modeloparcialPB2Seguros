package ar.edu.unlam.pb2.eva03;

public class Vivienda implements Bien {

	private String direccion;
	private String localidad;
	private String partido;
	private String provincia;

	public Vivienda(String direccion, String localidad, String partido, String provincia) {
		this.direccion = direccion;
		this.localidad = localidad;
		this.partido = partido;
		this.provincia = provincia;
	}

}
