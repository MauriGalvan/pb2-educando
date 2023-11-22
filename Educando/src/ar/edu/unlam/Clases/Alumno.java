package ar.edu.unlam.Clases;

import java.time.LocalDate;

public class Alumno {
	Integer dni;
	String nombre;
	LocalDate fechaNacimiento;
	
		public Alumno(Integer dni, String nombre, LocalDate fechaNacimiento) {
			this.dni = dni;
			this.nombre = nombre;
			this.fechaNacimiento = fechaNacimiento;
		
		}
		public Integer getDni() {
			return dni;
		}
		public void setDni(Integer dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		
	
}
