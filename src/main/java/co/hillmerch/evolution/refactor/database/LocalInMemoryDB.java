package co.hillmerch.evolution.refactor.database;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import co.hillmerch.evolution.refactor.entity.Cargo;
import co.hillmerch.evolution.refactor.entity.Persona;
import co.hillmerch.evolution.refactor.entity.SolicitudContratacion;

public class LocalInMemoryDB {

	final List<Persona> personas =
			List.of(
					new Persona( 100012L, "Amy" ),
					new Persona( 100034L, "Hillmer" ),
					new Persona( 100056L, "Rodrigo" ),
					new Persona( 100078L, "Sandra" ),
					new Persona( 100090L, "Tiana" ),
					new Persona( 200090L, "Carlos" )
			);

	final List<Cargo> cargos =
			List.of(
					new Cargo( "Diseñador" ),
					new Cargo( "Desarrollador" ),
					new Cargo( "Líder técnico" ),
					new Cargo( "Director" )
			);

	final List<SolicitudContratacion> solicitudContratacions =
			List.of( buildSolicitudContratacion( 100012L, "Diseñador",
												 LocalDate.of( 2021, Month.AUGUST, 1 ),
												 LocalDate.of( 2022, Month.AUGUST, 1 ),
												 SolicitudContratacion.Estado.PENDIENTE
					 ),
					 buildSolicitudContratacion( 100034L, "Líder técnico",
												 LocalDate.of( 2021, Month.AUGUST, 1 ),
												 LocalDate.of( 2022, Month.AUGUST, 1 ),
												 SolicitudContratacion.Estado.PENDIENTE
					 ),
					 buildSolicitudContratacion( 100056L, "Desarrollador",
												 LocalDate.of( 2021, Month.AUGUST, 1 ),
												 LocalDate.of( 2022, Month.AUGUST, 1 ),
												 SolicitudContratacion.Estado.PENDIENTE
					 ),
					 buildSolicitudContratacion( 100078L, "Director",
												 LocalDate.of( 2021, Month.SEPTEMBER, 1 ),
												 LocalDate.of( 2022, Month.AUGUST, 1 ),
												 SolicitudContratacion.Estado.PENDIENTE
					 ),
					 buildSolicitudContratacion( 100090L, "Desarrollador",
												 LocalDate.of( 2021, Month.OCTOBER, 1 ),
												 LocalDate.of( 2022, Month.AUGUST, 1 ),
												 SolicitudContratacion.Estado.PENDIENTE
					 ),
					 buildSolicitudContratacion( 200090L, "Desarrollador",
												 LocalDate.of( 2021, Month.AUGUST, 1 ),
												 LocalDate.of( 2022, Month.AUGUST, 1 ),
												 SolicitudContratacion.Estado.FIRMADO
					 )
					 );

	private SolicitudContratacion buildSolicitudContratacion(
			Long cedula, String cargo,
			LocalDate fechaInicio, LocalDate fechaFinalizacion, SolicitudContratacion.Estado estado) {
		return new SolicitudContratacion(
				getPersona( cedula ),
				getCargo( cargo ),
				fechaInicio,
				fechaFinalizacion,
				estado
		);
	}

	private Persona getPersona(Long cedula) {
		return personas.stream().filter( p -> p.getCedula().equals( cedula ) ).findAny().get();
	}

	private Cargo getCargo(String nombre) {
		return cargos.stream().filter( p -> p.getNombre().equals( nombre ) ).findAny().get();
	}

	public List<SolicitudContratacion> getSolicitudContratacions() {
		return solicitudContratacions;
	}
}
