package co.hillmerch.evolution.concepts;

public class Calculadora {

	/*
	* Los métodos sumarXXXNumeros reciben tantos números como parámetros,
	* para esto cada método tiene un nombre único
	* Los métodos sumarNumeros utilizar sobrecarga utilizando el mismo
	* nombre de método sin importar el número de parámetros
	* */
	void sumarDosNumeros(int n1, int n2){
		int resultado = n1 + n2;

		System.out.println(resultado);
	}

	void sumarTresNumeros(int n1, int n2, int n3){
		int resultado = n1 + n2 + n3;

		System.out.println(resultado);
	}

	void sumarCuatroNumeros(int n1, int n2, int n3, int n4){
		int resultado = n1 + n2 + n3 + n4;

		System.out.println(resultado);
	}

	/*
	 * Los métodos a continuación utilizan polimorfismo dependiendo
	 * el número  y/o tipo de parámetros
	 * */
	void sumarNumeros(int n1, int n2){
		int resultado = n1 + n2;

		System.out.println(resultado);
	}

	void sumarNumeros(int n1, int n2, int n3){
		int resultado = n1 + n2 + n3;

		System.out.println(resultado);
	}

	void sumarNumeros(int n1, int n2, int n3, int n4){
		int resultado = n1 + n2 + n3 + n4;

		System.out.println(resultado);
	}

	void sumarNumeros(double n1, double n2){
		double resultado = n1 + n2;

		System.out.println("La suma de dos números doubles es: " + resultado);
	}
}
