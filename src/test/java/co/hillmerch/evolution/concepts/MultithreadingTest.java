package co.hillmerch.evolution.concepts;

import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class MultithreadingTest {

	private static final Logger LOGGER = LogManager.getLogger( MultithreadingTest.class );

	@Test
	void enviarPedidos() {

		Multithreading multithreading = new Multithreading();

		LOGGER.debug( "Inicia el llamado ejecución" );

		multithreading.enviarPedidos();

		LOGGER.debug( "Finaliza el llamado de la ejecución" );

		System.out.println("Solo adiciona un breakpoint aca");
		System.out.println("y aca");
		System.out.println("y aca");
		System.out.println("y aca");

		LOGGER.debug( "Despues de hacer el debug" );
	}
}
