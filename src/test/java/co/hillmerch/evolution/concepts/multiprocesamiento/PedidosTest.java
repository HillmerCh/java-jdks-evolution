package co.hillmerch.evolution.concepts.multiprocesamiento;

import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


class PedidosTest {

	private static final Logger LOGGER = LogManager.getLogger( PedidosTest.class );

	@Test
	void enviarPedidos() {

		var pedidos = new Pedidos();

		LOGGER.debug( "Inicia el llamado ejecución" );

		pedidos.enviarPedidos();

		LOGGER.debug( "Finaliza el llamado de la ejecución" );

		System.out.println("Solo adiciona un breakpoint aca");
		System.out.println("y aca");
		System.out.println("y aca");
		System.out.println("y aca");

		LOGGER.debug( "Despues de hacer el debug" );
	}
}
