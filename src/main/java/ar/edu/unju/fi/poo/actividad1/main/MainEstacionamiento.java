package ar.edu.unju.fi.poo.actividad1.main;

import java.util.Calendar;
import java.util.Date;
import ar.edu.unju.fi.poo.actividad1.manager.Manager;
import ar.edu.unju.fi.poo.actividad1.model.*;

public class MainEstacionamiento {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Date fechaActual = new Date();

        // Herramientas para manipular horas
        Calendar calValido = Calendar.getInstance();
        calValido.add(Calendar.DAY_OF_MONTH, -1); 
        calValido.set(Calendar.HOUR_OF_DAY, 15);  // Ingreso a las 15:00 hs para no chocar con las 21hs (nota:agregado por simplemente error al sincronizarse con el horario de la maquina del usuario)
        calValido.set(Calendar.MINUTE, 0);
        
        Calendar calInvalido = Calendar.getInstance();
        calInvalido.set(Calendar.HOUR_OF_DAY, 22); 
        
        Calendar calCuponVencido = Calendar.getInstance();
        calCuponVencido.add(Calendar.DAY_OF_MONTH, -5); 

        Calendar calCuponValido = Calendar.getInstance();
        calCuponValido.add(Calendar.DAY_OF_MONTH, 5); 

        System.out.println(" a. Ingreso por hora sin cupón ---");
        Vehiculo v1 = new Vehiculo("AAA111", "Ford", "Rojo");
        PorHora reg1 = new PorHora(1, fechaActual, calValido.getTime(), v1, "", null, 1000.0);
        manager.registrarIngreso(reg1);

        System.out.println("\n b. Ingreso por hora con cupones ---");
        Cupon cuponMalo = new Cupon("CUP01", calCuponVencido.getTime(), 20.0);
        Cupon cuponBueno = new Cupon("CUP02", calCuponValido.getTime(), 50.0);
        
        Vehiculo v2 = new Vehiculo("BBB222", "Fiat", "Gris");
        PorHora reg2 = new PorHora(2, fechaActual, calValido.getTime(), v2, "", cuponMalo, 1000.0);
        manager.registrarIngreso(reg2);
        
        Vehiculo v3 = new Vehiculo("CCC333", "Renault", "Blanco");
        PorHora reg3 = new PorHora(3, fechaActual, calValido.getTime(), v3, "", cuponBueno, 1000.0);
        manager.registrarIngreso(reg3);

        System.out.println("\n c. Ingreso fuera de horario (22:00 hs) ---");
        Vehiculo v4 = new Vehiculo("DDD444", "VW", "Negro");
        PorHora reg4 = new PorHora(4, fechaActual, calInvalido.getTime(), v4, "", null, 1000.0);
        manager.registrarIngreso(reg4);

        System.out.println("\n d. Ingreso Mensual ---");
        Cliente cliente = new Cliente(100, "30123456", "Calle Falsa 123", "3884123456");
        Vehiculo v5 = new Vehiculo("EEE555", "Toyota", "Azul");
        Mensual reg5 = new Mensual(5, fechaActual, calValido.getTime(), v5, "", cliente);
        manager.registrarIngreso(reg5);

        System.out.println("\n e. Buscar ID 1 (Importe actual antes de salir) ---");
        RegistroIngresoSalida encontrado = manager.obtenerRegistro(1);
        if(encontrado != null) {
            System.out.println("Patente encontrada: " + encontrado.getVehiculo().getPatente());
        }

        System.out.println("\n f. Registrar Salidas Por Hora ---");
        if (manager.obtenerRegistro(1) != null) manager.registrarSalida(manager.obtenerRegistro(1)); 
        if (manager.obtenerRegistro(2) != null) manager.registrarSalida(manager.obtenerRegistro(2)); 
        if (manager.obtenerRegistro(3) != null) manager.registrarSalida(manager.obtenerRegistro(3)); 

        System.out.println("\n--- g. Registrar Salida Mensual ---");
        if (manager.obtenerRegistro(5) != null) manager.registrarSalida(manager.obtenerRegistro(5)); 
    }
}