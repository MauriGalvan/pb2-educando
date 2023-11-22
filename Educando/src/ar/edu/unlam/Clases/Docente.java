package ar.edu.unlam.Clases;

import java.util.Set;

public class Docente {
	
	String nombre;
Set<Grado> competencia;
	public Docente(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarCompetencia(Grado grado) {
		this.competencia.add(grado);
	}

}

