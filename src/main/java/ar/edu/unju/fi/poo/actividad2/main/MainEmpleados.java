package ar.edu.unju.fi.poo.actividad2.main;

import java.time.LocalDate;
import ar.edu.unju.fi.poo.actividad2.manager.*;
import ar.edu.unju.fi.poo.actividad2.model.*;

public class MainEmpleados {
    public static void main(String[] args) {
        ManagerEmpleado manager = new ManagerEmpleado();

        // -------------------------------------------------------------
        // PROFESIONALES
        
        Profesional prof1 = new Profesional(101, 38111222, "Carlos Gómez", LocalDate.of(2018, 5, 10), 2);
        prof1.agregarTitulo(new Titulo(2015, "Ingeniería en Sistemas", "Universitario"));
        prof1.agregarTitulo(new Titulo(2020, "Diplomatura en Datos", "Universitario"));
        manager.agregarEmpleado(prof1);
        
        Profesional prof2 = new Profesional(102, 39222333, "Ana Martínez", LocalDate.of(2021, 3, 15), 0);
        prof2.agregarTitulo(new Titulo(2019, "Licenciatura en Administración", "Universitario"));
        manager.agregarEmpleado(prof2);

        
        // -------------------------------------------------------------
        // ADMINISTRATIVOS
        
        Administrativo adm1 = new Administrativo(103, 35444555, "Laura Ríos", LocalDate.of(2015, 8, 20), 1, 'A');
        manager.agregarEmpleado(adm1);

        Administrativo adm2 = new Administrativo(104, 32666777, "Roberto Peña", LocalDate.of(2010, 11, 5), 3, 'C');
        manager.agregarEmpleado(adm2);

        
        // -------------------------------------------------------------
        // LIMPIEZA
        Limpieza limp1 = new Limpieza(105, 40888999, "Marta Sánchez", LocalDate.of(2022, 1, 10), 2);
        manager.agregarEmpleado(limp1);

        Limpieza limp2 = new Limpieza(106, 41000111, "Jorge Torres", LocalDate.of(2023, 6, 1), 0);
        manager.agregarEmpleado(limp2);

        // -------------------------------------------------------------
        // Mostrar lista general
        System.out.println("=== LISTA DE EMPLEADOS REGISTRADOS ===");
        manager.mostrarSueldosTodos();
    }
}

