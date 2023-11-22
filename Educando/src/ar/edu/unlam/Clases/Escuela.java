package ar.edu.unlam.Clases;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.exception.SinCursosDisponiblesException;

public class Escuela {
private	String nombreEscuela;
Set<Curso>cursos;
Set<Alumno> alumnos;
Map<Alumno, Integer> inscripcionAcl;
Grado grado;
	public Escuela(String nombreEscuela) {
		// TODO Auto-generated constructor stub
		this.nombreEscuela = nombreEscuela;
		this.cursos = new HashSet<Curso>();
	}

	public String getNombreEscuela() {
		return nombreEscuela;
	}

	public void setNombreEscuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
	}

	public void crearCurso(GradoPrimaria cursoNuevo) throws SinCursosDisponiblesException {
	for (Curso c : cursos) {
		if(c.getGrado().equals(grado)) {
			cursos.add(cursoNuevo);
		}
	}
	throw new SinCursosDisponiblesException();
		
	}

	public void inscribir(Alumno alumno, Integer cl)  {

		inscripcionAcl.put(alumno, cl);
	}

}
