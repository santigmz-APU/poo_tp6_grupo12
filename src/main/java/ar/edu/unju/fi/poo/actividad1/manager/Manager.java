package ar.edu.unju.fi.poo.actividad1.manager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ar.edu.unju.fi.poo.actividad1.model.*;

public class Manager {
    private List<RegistroIngresoSalida> registros;

    public Manager() {
        this.registros = new ArrayList<>();
    }

    public boolean validarPatente(String patente) {
        for (RegistroIngresoSalida r : registros) {
            if (r.getVehiculo().getPatente().equals(patente) && "INGRESADO".equals(r.getEstado())) {
                return false; 
            }
        }
        return true; 
    }

    public void registrarIngreso(RegistroIngresoSalida registro) {
        if (!validarPatente(registro.getVehiculo().getPatente())) {
            System.out.println("Error: El vehículo " + registro.getVehiculo().getPatente() + " ya está en la playa.");
            return;
        }

        if (registro instanceof PorHora) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(registro.getHora());
            if (cal.get(Calendar.HOUR_OF_DAY) >= 21) {
                System.out.println("error: No se permiten ingresos por hora después de las 21:00 hs.");
                return;
            }
        }

        registro.cambiarEstado("INGRESADO");
        registros.add(registro);
        System.out.println("Ingreso registrado: Vehículo " + registro.getVehiculo().getPatente());
    }

    public Double registrarSalida(RegistroIngresoSalida registro) {
        if ("AFUERA".equals(registro.getEstado())) {
            System.out.println("el vehículo ya fue retirado previamente.");
            return 0.0;
        }

        Double importeFinal = 0.0;
        registro.cambiarEstado("AFUERA");

        if (registro instanceof Mensual) {
            importeFinal = registro.obtenerImporte(); 
            System.out.println("Salida Mensual: Importe a pagar es $" + importeFinal);
            
        } else if (registro instanceof PorHora) {
            PorHora ph = (PorHora) registro;
            
            Date horaSalida = new Date(); 
            long diferenciaMilisegundos = horaSalida.getTime() - ph.getHora().getTime();
            long horas = diferenciaMilisegundos / (60 * 60 * 1000);
            
            if (diferenciaMilisegundos % (60 * 60 * 1000) > 0 || horas == 0) {
                horas++;
            }

            importeFinal = horas * ph.getValorHora();

            if (ph.getCupon() != null) {
                if (ph.getCupon().getFechaVencimiento().after(horaSalida)) {
                    double descuento = importeFinal * (ph.getCupon().getPorcentajeDescuento() / 100.0);
                    importeFinal -= descuento;
                    System.out.println("cupon aplicado correctamente. Descuento: $" + descuento);
                } else {
                    System.out.println("el cupon presentado se encuentra vencido.");
                }
            }
            System.out.println("Salida Por Hora: Total a pagar $" + importeFinal + " (Tiempo: " + horas + " horas).");
        }
        return importeFinal;
    }

    public RegistroIngresoSalida obtenerRegistro(Integer id) {
        for (RegistroIngresoSalida r : registros) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }
}