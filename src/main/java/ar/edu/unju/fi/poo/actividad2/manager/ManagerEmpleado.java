package ar.edu.unju.fi.poo.actividad2.manager;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.poo.actividad2.model.Empleado;
import ar.edu.unju.fi.poo.actividad2.model.Administrativo;
import ar.edu.unju.fi.poo.actividad2.model.Profesional;
import ar.edu.unju.fi.poo.actividad2.model.Limpieza;

public class ManagerEmpleado {
    private List<Empleado> empleados;

    public ManagerEmpleado() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) {
        if (emp != null) {
            this.empleados.add(emp);
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void mostrarSueldosTodos() {
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + 
                               " | Legajo: " + e.getLegajo() + 
                               " | Sueldo Neto: $" + e.calcularSueldoNeto());
        }
    }
    
    public Empleado buscarPorLegajo(int legajo) {
        for (Empleado e : empleados) {
            if (e.getLegajo() == legajo) {
                return e;
            }
        }
        return null;
    }

    // NUEVOS MÉTODOS AGREGADOS PARA CUMPLIR CON LAS OPERACIONES FALTANTES AAAAAAAAAAA

    // Método para filtrar empleados administrativos por categoría (Punto E)
    public List<Administrativo> obtenerAdministrativosPorCategoria(char categoria) {
        List<Administrativo> filtrados = new ArrayList<>();
        for (Empleado e : this.empleados) {
            if (e instanceof Administrativo) {
                Administrativo adm = (Administrativo) e;
                if (adm.getCategoria() == categoria) {
                    filtrados.add(adm);
                }
            }
        }
        return filtrados;
    }

    // Método para calcular el neto acumulado según el tipo de empleado (Punto F) mas que nada todas las adiciones son para dejar mas completo al manager empleados antes con solo la busqueda de legajos y algunas mas vi que estaba medio desnudo y casi que el main se encargaba de algunas de las cosas usadas.
    public double calcularNetoAcumuladoPorTipo(int opcionTipo) {
        double acumulado = 0.0;
        for (Empleado e : this.empleados) {
            if (opcionTipo == 1 && e instanceof Profesional) {
                acumulado += e.calcularSueldoNeto();
            } else if (opcionTipo == 2 && e instanceof Administrativo) {
                acumulado += e.calcularSueldoNeto();
            } else if (opcionTipo == 3 && e instanceof Limpieza) {
                acumulado += e.calcularSueldoNeto();
            }
        }
        return acumulado;
    }
}