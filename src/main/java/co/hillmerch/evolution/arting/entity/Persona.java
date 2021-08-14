package co.hillmerch.evolution.arting.entity;

public class Persona {

	private Long cedula;
	private String nombre;

	public Persona(Long cedula, String nombre) {
		this.cedula = cedula;
		this.nombre = nombre;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
