package co.hillmerch.evolution.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sample {

	// Imprimir el maximo numero de una lista
	void printMax() {
		//JDK5
		var numbers = List.of(1L, 2L, 3L, 4L, 5L);
		var max = numbers.stream().max( Comparator.naturalOrder() ).get();
		System.out.println(max);
	}

/*	void printMax() {
		List numbers = new ArrayList();
		numbers.add(1L);
		numbers.add(2L);
		numbers.add(3L);
		numbers.add(4L);
		numbers.add(5L);
		Long max = null;
		for(int it=0; it < numbers.size(); it++){
			Long numero = (Long)numbers.get( it );
			if(max == null){
				max = numero;
			}else if(numero>max){
				max = numero;
			}
		}
		System.out.println(max);
	}*/


}
