package ar.edu.unju.fi.poo.actividad1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Profesional extends Empleado {
	List<Titulo> titulos;

	public Profesional(int legajo, int documento, String nombre, LocalDate fechaIngreso, int cantidadHijos) {
		super(legajo, documento, nombre, fechaIngreso, cantidadHijos);
		this.titulos = new ArrayList<>();
	}
	
	@Override
	public double calcularSueldoNeto() {
		// Calcular sueldito 
		return 0;
	}
	
	public void agregarTitulo(Titulo titulonuevo) {
		titulos.add(titulonuevo);
		System.out.println("Titulo agregado exitosamente");
	}
}
