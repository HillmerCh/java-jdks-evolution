package co.hillmerch.evolution.concepts.polimorfismo;

public record Cliente(String identificacion, String nombres, String apellidos) {

	public int compararPorIdentificacion(Cliente cliente) {
		return this.identificacion.compareTo( cliente.identificacion );
	}
}
