package co.hillmerch.evolution.arting.entity;

import java.time.LocalDate;


public class SolicitudContratacion {

	public enum Estado{
		PENDIENTE,
		GENERADO,
		ENVIADO,
		FIRMADO
	}

	private Persona persona;
	private Cargo cargo;
	private LocalDate fechaInicio;
	private LocalDate fechaFinalizacion;
	private Estado estado;

	public SolicitudContratacion(Persona persona, Cargo cargo, LocalDate fechaInicio, LocalDate fechaFinalizacion, Estado estado) {
		this.persona = persona;
		this.cargo = cargo;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.estado = estado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
