package ar.edu.unlam.pb2.eva03;

public class Persona {
	private Double pagoPorSiniestro; 
	private String nombre;
	private Integer dni;
	private Integer edad;
	private Boolean robado;
	private Boolean accidentado;

	public Persona(String nombre, Integer dni, Integer edad) {
		this.nombre = nombre; 
		this.dni = dni; 
		this.edad = edad; 
		this.pagoPorSiniestro = 0.0;
		this.robado = false;
		this.accidentado= false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public void setPagoPorSiniestro(Double sumaAPagar) {
		this.pagoPorSiniestro = sumaAPagar;
	}

	public Boolean getRobado() {
		return robado;
	}

	public void setRobado(Boolean robado) {
		this.robado = robado;
	}

	public Boolean getAccidentado() {
		return accidentado;
	}

	public void setAccidentado(Boolean accidentado) {
		this.accidentado = accidentado;
	}
	

}
