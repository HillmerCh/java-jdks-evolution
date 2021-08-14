package co.hillmerch.evolution.concepts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraLetrasTest  {

	@Test
	void sumarNumeros() {
		CalculadoraLetras calculadoraLetras = new CalculadoraLetras();
		calculadoraLetras.sumarNumeros( 1,1 );

		calculadoraLetras.sumarNumeros( 1, 1, 1 );
	}

}
