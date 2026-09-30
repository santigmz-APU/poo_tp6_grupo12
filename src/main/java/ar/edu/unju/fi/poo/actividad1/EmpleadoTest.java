package ar.edu.unju.fi.poo.actividad1;

import java.time.LocalDate;

import ar.edu.unju.fi.poo.actividad1.model.Administrativo;
import ar.edu.unju.fi.poo.actividad1.model.Profesional;

public class EmpleadoTest {

	public static void main(String[] args) {
		// CLASE DE PRUEBA PARA CORROBORAR QUE FUNCIONA LA IMPLEMENTACION DEL DIAGRAMA
		
		Administrativo admin = new Administrativo(100, 46645028, "Santiago", LocalDate.of(2005, 5, 16), 0, 'A');
		Profesional prof = new Profesional(101, 82054664, "Mariano", LocalDate.of(2010, 2, 14), 3);
		
		prof.mostrarEmpleado();
		admin.mostrarEmpleado();
	}

}
