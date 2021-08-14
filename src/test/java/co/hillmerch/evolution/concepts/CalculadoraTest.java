package co.hillmerch.evolution.concepts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

/*	@Test
	void sumarDosNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarDosNumeros( 1,2 );
	}

	@Test
	void sumarTresNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarTresNumeros( 1,2, 3);
	}

	@Test
	void sumarCuatroNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarCuatroNumeros( 1,2 ,3,4);
	}*/


	@Test
	void sumarDosNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarNumeros( 1,2 );
	}

	@Test
	void sumarTresNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarNumeros( 1,2, 3);
	}

	@Test
	void sumarCuatroNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarNumeros( 1,2 ,3,4);
	}

}
