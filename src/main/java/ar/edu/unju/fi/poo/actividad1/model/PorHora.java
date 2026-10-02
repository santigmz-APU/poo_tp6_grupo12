package ar.edu.unju.fi.poo.actividad1.model;

import java.util.Date;

public class PorHora extends RegistroIngresoSalida {
    private Cupon cupon;
    private double valorHora;

    public PorHora() {}

    public PorHora(Integer id, Date fecha, Date hora, Vehiculo vehiculo, String estado, Cupon cupon, double valorHora) {
        super(id, fecha, hora, vehiculo, estado);
        this.cupon = cupon;
        this.valorHora = valorHora;
    }

    @Override
    public Double obtenerImporte() {
        return 0.0; 
    }

	public Cupon getCupon() {
		return cupon;
	}

	public void setCupon(Cupon cupon) {
		this.cupon = cupon;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

    
}