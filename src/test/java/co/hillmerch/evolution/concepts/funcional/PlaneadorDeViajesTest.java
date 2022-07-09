package co.hillmerch.evolution.concepts.funcional;

import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaneadorDeViajesTest {

	private static final Logger LOGGER = LogManager.getLogger( PlaneadorDeViajesTest.class );

	@Test
	void rutaMasRapida() {
		var planeadorDeViajes = new PlaneadorDeViajes();
		var rutaMasRapida = planeadorDeViajes.rutaMasRapida();
		LOGGER.info( "La ruta más rápida es: {} ", rutaMasRapida );
		assertEquals( new Ruta( MedioTransporte.BUS, 50L, 10 ), rutaMasRapida);
	}
}
