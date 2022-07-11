package co.hillmerch.evolution.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Evolucion {

	/*
	* Los métodos imprimirNumeros_0a y imprimirNumeros_0b están implementados utilizando algunas de las
	* técnicas disponibles en las primeras versiones de Java
	* Los métodos imprimirNumeros_1 al imprimirNumeros_4  están implementados utilizando algunas de las
	* novedades incluidas durante la evolución del mas de 20 años
	* */
	void imprimirNumeros_0a(){
		List numeros = new ArrayList<>();

		numeros.add( 1 );
		numeros.add( 2 );
		numeros.add( "\uD83E\uDD2A" );
		numeros.add( 3.5 );
		numeros.add( 4 );
		numeros.add( "CINCO" );
		numeros.add( "YO NO SOY UN NUMERO" );
		System.out.println(numeros);
	}

	void imprimirNumeros_0b(){
		List numeros = new ArrayList<>();

		numeros.add( 1 );
		numeros.add( 2 );
		numeros.add( "\uD83E\uDD2A" );
		numeros.add( 3.5 );
		numeros.add( 4 );
		numeros.add( "CINCO" );
		numeros.add( "YO NO SOY UN NUMERO" );

		for ( int i = 0; i < numeros.size(); i++ ) {
			Object unElemento = numeros.get( i );
			if( unElemento instanceof Integer)
				System.out.println(unElemento);
		}

	}

	/*
	* 1. Uso de generic <Double>
	* 2. Uso de Arrays para crear la lista
	* 3. Uso the List.of para crear la lista + forEach
	* 4. Uso the Stream.of para crear la lista + Collectors + toList() + var
	 * */

	void imprimirNumeros(){
	}

	void imprimirNumeros_4(){
		var numeros = Stream.of( 1D, 2D, 3.5D, 4D, 5D ).toList();
		numeros.forEach( System.out::println );
	}

	void imprimirNumeros_3(){
		List<Double> numeros = List.of( 1D, 2D, 3.5D, 4D, 5D );
		numeros.forEach( System.out::println );
	}

	void imprimirNumeros_2(){
		List<Double> numeros = Arrays.asList( 1D, 2D, 3.5D, 4D, 5D );

		for ( int i = 0; i < numeros.size(); i++ ) {
			System.out.println(numeros.get( i ));
		}
	}

	void imprimirNumeros_1(){
		List<Double> numeros = new ArrayList<>();

		numeros.add( 1D );
		numeros.add( 2D );
		numeros.add( 3D );
		numeros.add( 4D );
		numeros.add( 5D );

		for ( int i = 0; i < numeros.size(); i++ ) {
			System.out.println(numeros.get( i ));
		}
	}


}
