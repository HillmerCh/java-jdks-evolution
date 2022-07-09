package co.hillmerch.evolution.concepts;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.LongStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Multiprocesamiento {

	private static final Logger LOGGER = LogManager.getLogger( Multiprocesamiento.class );

	void enviarPedidosUnSoloHilo(){
		List<Long> pedidos = consultarPedidos();
		LOGGER.debug( "Número de pedidos: {}" , pedidos.size() );

		for ( Long pedido : pedidos ) {
			this.generarOrdenDeEnvio(pedido);
		}

	}

	void enviarPedidosConThread(){
		List<Long> pedidos = consultarPedidos();
		LOGGER.debug( "Número de pedidos: {}" , pedidos.size() );
		for ( Long pedido : pedidos ) {
			Thread t = new Thread( () -> this.generarOrdenDeEnvio(pedido) );
			t.start();
		}
	}

	void enviarPedidosConExecutor(){
		List<Long> pedidos = consultarPedidos();
		LOGGER.debug( "Número de pedidos: {}" , pedidos.size() );
		ExecutorService executor = Executors.newFixedThreadPool( 2 );

		for ( Long pedido : pedidos ) {
			executor.submit( () -> this.generarOrdenDeEnvio(pedido) );
		}
	}

	void enviarPedidos(){
		List<Long> pedidos = consultarPedidos();
		LOGGER.debug( "Número de pedidos: {}" , pedidos.size() );

		ExecutorService executor = Executors.newFixedThreadPool( 2 );

		for ( Long pedido : pedidos ) {
			CompletableFuture.runAsync( () -> this.generarOrdenDeEnvio( pedido), executor );
		}
	}

	private void generarOrdenDeEnvio(Long numeroPedido){
		LOGGER.debug( "Inicia generación de la Orden del pedido No. {}" , numeroPedido );
		sleep();
		LOGGER.debug( "Finaliza generación de la Orden de pedido No. {}" , numeroPedido );
	}

	private void sleep() {
		try {
			Random r = new Random();
			Thread.sleep(r.nextInt(10) * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	private List<Long> consultarPedidos() {
		return LongStream.rangeClosed( 1, 10 ).boxed().toList();
	}

}
