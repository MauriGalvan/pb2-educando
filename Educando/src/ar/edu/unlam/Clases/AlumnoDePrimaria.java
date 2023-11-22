package ar.edu.unlam.Clases;

import java.time.LocalDate;
import java.util.Set;

public class AlumnoDePrimaria extends Alumno {

	Set<Alumno> asistencia;
	
	
	public AlumnoDePrimaria(Integer dni, String nombre, LocalDate fechaNacimiento) {
		super(dni, nombre, fechaNacimiento);
		// TODO Auto-generated constructor stub
		
	}

	

	public void asistir(LocalDate now) {

	
	}

	public boolean asistio(LocalDate now) {
		// TODO Auto-generated method stub
		return false;
	}


}
