package co.hillmerch.evolution.concepts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

	@Test
	void sumarDosNumeros_V0() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarDosNumeros( 1, 2 );
	}

	@Test
	void sumarTresNumeros_V0() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarTresNumeros( 1, 2, 3);
	}

	@Test
	void sumarCuatroNumeros_V0() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarCuatroNumeros( 1, 2, 3, 4);
	}

	/*
	* Los casos de prueba a continuación prueban métodos que utilizan sobrecarga
	* */
	@Test
	void sumarDosNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarNumeros( 1, 2 );
	}

	@Test
	void sumarTresNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarNumeros( 1, 2, 3);
	}

	@Test
	void sumarCuatroNumeros() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarNumeros( 1,2 , 3, 4);
	}

	@Test
	void sumarDosNumerosDouble() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumarNumeros( 1.3, 2.5 );
	}
	/*
	 * Los caso de prueba a continuación prueban métodos que utilizan herencia para sobrecargar el
	 * */
	@Test
	void sumarDosNumerosLetras() {
		Calculadora calculadora = new CalculadoraLetras();
		calculadora.sumarNumeros( 1, 2);
		calculadora.sumarNumeros( 1, 2, 3);
	}

}
