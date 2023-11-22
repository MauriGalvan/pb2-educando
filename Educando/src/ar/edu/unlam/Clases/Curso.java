package ar.edu.unlam.Clases;

public class Curso {

	private String descripcion;
	private Integer cl;
	private Integer edad;
	private Grado grado;

	public Curso(String descripcion, Integer cl, Integer edad, Grado grado) {
		this.cl = cl;
		this.descripcion = descripcion;
		this.edad = edad;
		this.grado = grado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCl() {
		return cl;
	}

	public void setCl(Integer cl) {
		this.cl = cl;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

}
