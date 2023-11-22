package ar.edu.unlam.Clases;

import java.util.HashSet;
import java.util.Set;

public class GradoPrimaria extends Curso{

	
	Docente docentes;
	
	public GradoPrimaria(String descripcion, Integer cl, Integer edad, Grado grado) {
		super(descripcion, cl, edad, grado);
		// TODO Auto-generated constructor stub
		
	}

	public void setDocente(Docente docente) {
		this.docentes = docente;	
	}


}
