package co.hillmerch.evolution;

import java.util.List;
import java.util.stream.Collectors;

import co.hillmerch.evolution.dtos.Product;
import co.hillmerch.evolution.records.ProductJDK16;

public class SomeFeatures {

	enum CustomerType {
		NONPROFIT,
		MILITARY,
		VIP,
		EMPLOYEE,
		LOCAL
	}

	public static Long sum(Long number1, Long number2) {
		return number1 + number2;
	}


	public static Long getDiscount(CustomerType myType) {
		if ( myType.equals( CustomerType.NONPROFIT ) || myType.equals( CustomerType.MILITARY ) ) {
			return 10L;
		}
		else if ( myType.equals( CustomerType.VIP ) || myType.equals( CustomerType.EMPLOYEE ) ) {
			return 20L;
		}
		else if ( myType.equals( CustomerType.LOCAL ) ) {
			return 5L;
		}
		else {
			return 0L;
		}
	}

	public static Long getDiscountJDK14(CustomerType myType) {

		return switch ( myType ) {
			case NONPROFIT, MILITARY -> 10L;
			case VIP, EMPLOYEE -> 20L;
			case LOCAL -> 5L;
			default -> 0L;
		};

	}


	public static String buildJPQL() {

		String sql = "SELECT o, p, q  \n";
		sql = sql + " FROM Product o, Location p, Invoice q \n";
		sql = sql + " WHERE o.type= :type \n";
		sql = sql + " AND p.country= :country AND p.state= :state AND p.city= :city \n";
		sql = sql + " AND q.date BETWEEN :dateFrom AND :dateTo \n";

		return sql;
	}

	public static String buildJPQLJDK15() {

		String sql = """
				SELECT o, p, q  
				FROM Product o, Location p, Invoice q 
				WHERE o.type= :type
				AND p.country= :country AND p.state= :state AND p.city= :city 
				AND q.date BETWEEN :dateFrom AND :dateTo 
				""";

		return sql;
	}


	public static String getProductName(Object anyObject) {
		if ( anyObject instanceof Product ) {
			Product product = (Product) anyObject;
			return product.getName();
		}
		else if ( anyObject instanceof ProductJDK16 ) {
			ProductJDK16 productJDK16 = (ProductJDK16) anyObject;
			return productJDK16.name();
		}
		else {
			return null;
		}
	}

	public static String getProductNameJDK16(Object anyObject) {
		if ( anyObject instanceof Product product ) {
			return product.getName();
		}
		else if ( anyObject instanceof ProductJDK16 productJDK16 ) {
			return productJDK16.name();
		}
		else {
			return null;
		}
	}


	public static Product buildProduct(String name, Double price) {
		return new Product( name, price );
	}

	public static ProductJDK16 buildProductJDK16(String name, Double price) {
		return new ProductJDK16( name, price );
	}


	public static List<String> getProductNames(List<Product> productJDK16s) {
		return productJDK16s.stream().map( Product::getName ).collect( Collectors.toList() );
	}

	public static List<String> getProductNamesJDK16(List<ProductJDK16> productJDK16s) {
		return productJDK16s.stream().map( ProductJDK16::name ).toList();
	}


}
