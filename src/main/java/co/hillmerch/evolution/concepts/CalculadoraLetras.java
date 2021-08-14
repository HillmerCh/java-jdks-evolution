package co.hillmerch.evolution.concepts;

public class CalculadoraLetras  extends Calculadora{

	void sumarNumeros(int n1, int n2){
		int resultado = n1 + n2;

		System.out.println(getNameOfANumber(resultado));
	}

	private String getNameOfANumber(int number){
		if (number==1){
			return "ONE";
		}

		if (number==2){
			return "TWO";
		}

		if (number==3){
			return "THREE";
		}

		if (number==4){
			return "FOUR";
		}

		return "UNDEFINED";
	}

}
