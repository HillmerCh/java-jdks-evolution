package co.hillmerch.evolution;

import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.hillmerch.evolution.dtos.Product;
import co.hillmerch.evolution.records.ProductJDK16;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SomeFeaturesTest {

	@Test
	void sum() {
		Exception exception = assertThrows(
				NullPointerException.class,
				() -> SomeFeatures.sum( null, null ));

		System.out.println(exception.getMessage());
	}


	@Test
	void getDiscount() {
		System.out.println( SomeFeatures.getDiscount( SomeFeatures.CustomerType.VIP ) );
	}

	@Test
	void getDiscountJDK14() {
		System.out.println( SomeFeatures.getDiscountJDK14( SomeFeatures.CustomerType.VIP ) );
	}


	@Test
	void buildJPQL() {
		System.out.println( SomeFeatures.buildJPQL() );
	}

	@Test
	void buildJPQLJDK15() {
		System.out.println( SomeFeatures.buildJPQLJDK15() );
	}


	@Test
	void buildProduct() {
		System.out.println( SomeFeatures.buildProduct( "Functional programming in Java", 21.99 ) );
	}

	@Test
	void buildProductJDK16() {
		System.out.println( SomeFeatures.buildProductJDK16( "Functional programming in Java", 21.99 ) );
	}


	@Test
	void getProductName() {
		System.out.println( SomeFeatures.getProductName( new Product( "Functional programming in Java", 21.99 ) ) );
	}

	@Test
	void getProductNameJDK16() {
		System.out.println( SomeFeatures.getProductNameJDK16( new Product( "Functional programming in Java", 21.99 ) ) );
	}


	@Test
	void getProductNames() {
		System.out.println( SomeFeatures.getProductNames(
				List.of(
						new Product( "Functional programming in Java", 21.99 ),
						new Product( "Practices of an agile developer", 16.44 )
				)
		) );
	}

	@Test
	void getProductNamesJDK16() {
		System.out.println( SomeFeatures.getProductNamesJDK16(
				List.of(
						new ProductJDK16( "Functional programming in Java", 21.99 ),
						new ProductJDK16( "Practices of an agile developer", 16.44 )
				)
		) );
	}


}
