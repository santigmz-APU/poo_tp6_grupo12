package ar.edu.unju.fi.poo.actividad1.model;

public class Cliente {
	
	private int id;
	private String dni;
	private String marca;
	private String domicilio;
	private String celular;
	
	
	public Cliente() {}

    public Cliente(Integer id, String dni, String domicilio, String celular) {
        this.id = id;
        this.dni = dni;
        this.domicilio = domicilio;
        this.celular = celular;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}
