package co.hillmerch.evolution.concepts;

import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MultiprocesamientoTest {

	private static final Logger LOGGER = LogManager.getLogger( MultiprocesamientoTest.class );

	@Test
	void enviarPedidos() {

		Multiprocesamiento multiprocesamiento = new Multiprocesamiento();

		LOGGER.debug( "Inicia el llamado ejecución" );

		multiprocesamiento.enviarPedidos();

		LOGGER.debug( "Finaliza el llamado de la ejecución" );

		System.out.println("Solo adiciona un breakpoint aca");
		System.out.println("y aca");
		System.out.println("y aca");
		System.out.println("y aca");

		LOGGER.debug( "Despues de hacer el debug" );
	}
}
