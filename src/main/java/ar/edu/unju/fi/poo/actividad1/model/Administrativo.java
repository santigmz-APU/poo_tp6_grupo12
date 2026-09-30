package ar.edu.unju.fi.poo.actividad1.model;

import java.time.LocalDate;

public class Administrativo extends Empleado{
	Character categoria;

	public Administrativo(int legajo, int documento, String nombre, LocalDate fechaIngreso, int cantidadHijos,
			Character categoria) {
		super(legajo, documento, nombre, fechaIngreso, cantidadHijos);
		this.categoria = categoria;
	}
	
	@Override
	public double calcularSueldoNeto() {
		// Calcular sueldito 
		return 0;
	}
	
	public void setCategoria(Character caracter) {
		this.categoria = caracter;
	}
}
