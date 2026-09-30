package ar.edu.unju.fi.poo.actividad1.model;

import java.time.LocalDate;

public abstract class Empleado {
	private int legajo;
	private int documento;
	private String nombre;
	private LocalDate fechaIngreso;
	private int cantidadHijos;
	private double sueldoBasico = 400000.0;
	
	public Empleado(int legajo, int documento, String nombre, LocalDate fechaIngreso, int cantidadHijos) {
		super();
		this.legajo = legajo;
		this.documento = documento;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.cantidadHijos = cantidadHijos;
	}

	public abstract double calcularSueldoNeto();
	
	public double calcularAntiguedad() {
		double bonusAntiguedad = 0.0;
		return bonusAntiguedad;
	}
	
	public double calcularSalarioFamiliar() {
		double bonusFamiliar = 0.0;
		return bonusFamiliar;
	}
	
	public void mostrarSueldo() {
		System.out.println("El sueldo del empleado " + nombre + "es de: $" + calcularSueldoNeto());
	}
	
	public void mostrarEmpleado() {
		System.out.println("Legajo: " + legajo);
		System.out.println("Documento: " + documento);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de Ingreso: " + fechaIngreso);
		System.out.println("Cantidad de Hijos: " + cantidadHijos);
		System.out.println("Sueldo Neto " + calcularSueldoNeto());
	}
}
