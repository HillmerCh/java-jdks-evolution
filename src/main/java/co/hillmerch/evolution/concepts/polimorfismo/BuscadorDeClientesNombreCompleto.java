package co.hillmerch.evolution.concepts.polimorfismo;

import java.util.List;

public class BuscadorDeClientesNombreCompleto extends  BuscadorDeClientes{
	@Override
	public List<Cliente> buscar(String nombres, String apellidos) {
		return clientes.stream().filter( p -> p.nombres().equals( nombres ) && p.apellidos().equals( apellidos ) ).toList();
	}
}
