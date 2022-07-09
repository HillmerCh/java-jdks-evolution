package co.hillmerch.evolution.concepts;

public class CalculadoraLetras  extends Calculadora{

	/*
	* El método sumarNumeros usar herencia para sobreescribir el método definido en Calculadora.java
	* */
	void sumarNumeros(int n1, int n2){
		int resultado = n1 + n2;

		System.out.println(convertirNumeroEnLetras(resultado));
	}

	private String convertirNumeroEnLetras(int number){
		if (number==1){
			return "UNO";
		}

		if (number==2){
			return "DOS";
		}

		if (number==3){
			return "TRES";
		}

		if (number==4){
			return "CUATRO";
		}

		return "INDEFINIDO";
	}

}
