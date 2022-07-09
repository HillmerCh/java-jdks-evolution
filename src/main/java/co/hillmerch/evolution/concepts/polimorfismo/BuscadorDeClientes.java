package co.hillmerch.evolution.concepts.polimorfismo;

import java.util.List;

public class BuscadorDeClientes {

	protected List<Cliente> clientes = List.of(
			new Cliente( "12", "John", "Doe" ),
			new Cliente( "23", "Jane", "Doe" ),
			new Cliente( "34", "John", "Quil" ),
			new Cliente( "45", "Ray", "Sin" ),
			new Cliente( "56", "Brian", "Doe" ),
			new Cliente( "67", "Anne", "Doe" ),
			new Cliente( "78", "Ray", "Quil" ),
			new Cliente( "89", "John", "Harvey" ),
			new Cliente( "90", "Steve", "Doe" )
	);

	public List<Cliente> buscarPorIdentificacion(String identificacion) {
		return clientes.stream().filter( p -> p.identificacion().equals( identificacion ) ).toList();
	}

	public List<Cliente> buscarPorNombresYApellidos(String nombres, String apellidos) {
		return clientes.stream().filter( p -> p.nombres().equals( nombres ) || p.apellidos().equals( apellidos ) ).toList();
	}

	public List<Cliente> buscar(String identificacion) {
		return clientes.stream().filter( p -> p.identificacion().equals( identificacion ) ).toList();
	}

	public List<Cliente> buscar(String nombres, String apellidos) {
		return clientes.stream().filter( p -> p.nombres().equals( nombres ) || p.apellidos().equals( apellidos ) ).toList();
	}

	public List<Cliente> buscar(String identificacion, String nombres, String apellidos) {
		return clientes.stream().filter( p -> p.identificacion().equals( identificacion ) || p.nombres().equals( nombres ) || p.apellidos().equals( apellidos ) ).toList();
	}

}
