package co.hillmerch.evolution.concepts.polimorfismo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuscadorDeClientesTest {

	@Test
	void buscarPorIdentificacion_0() {
		var buscadorDeClientes = new BuscadorDeClientes();
		var clientes = buscadorDeClientes.buscarPorIdentificacion( "12" );
		System.out.println(clientes);
		assertEquals(1, clientes.size());
	}

	@Test
	void buscarPorNombresYApellidos_0() {
		var buscadorDeClientes = new BuscadorDeClientes();
		var clientes = buscadorDeClientes.buscarPorNombresYApellidos( "John", "Doe" );
		System.out.println(clientes);
		assertEquals(7, clientes.size());
	}

	@Test
	void buscarPorIdentificacion_1() {
		var buscadorDeClientes = new BuscadorDeClientes();
		var clientes = buscadorDeClientes.buscar( "12" );
		System.out.println(clientes);
		assertEquals(1, clientes.size());
	}

	@Test
	void buscarPorNombresYApellidos_1() {
		var buscadorDeClientes = new BuscadorDeClientes();
		var clientes = buscadorDeClientes.buscar( "John", "Doe" );
		System.out.println(clientes);
		assertEquals(7, clientes.size());
	}

	@Test
	void buscarPorIdentificacionONombresYApellidos_1() {
		var buscadorDeClientes = new BuscadorDeClientes();
		var clientes = buscadorDeClientes.buscar( "12", "John", "Doe" );
		System.out.println(clientes);
		assertEquals(7, clientes.size());
	}

	@Test
	void buscarPorNombresYApellidosCompletos_1() {
		var buscadorDeClientes = new BuscadorDeClientesNombreCompleto();
		var clientes = buscadorDeClientes.buscar( "John", "Doe" );
		System.out.println(clientes);
		assertEquals(1, clientes.size());

		var clientes2 = buscadorDeClientes.buscar( "56" );
		System.out.println(clientes2);
		assertEquals(1, clientes2.size());
	}

}
