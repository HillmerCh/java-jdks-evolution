package co.hillmerch.evolution.concepts.funcional;

import java.util.Comparator;
import java.util.List;

public class PlaneadorDeViajes {

	private List<Ruta> rutas = List.of(
			new Ruta( MedioTransporte.METRO, 60L, 15 ),
			new Ruta( MedioTransporte.BUS, 50L, 10 ),
			new Ruta( MedioTransporte.CICLA, 95L, 12 )
	);

	public Ruta rutaMasRapida() {
		return rutaMasRapida_0();
	}

	/*
	* El método rutaMasRapida_0 utiliza programación imperativa para buscar la ruta
	* más rápida
	* */
	public Ruta rutaMasRapida_0() {

		Ruta rutaMasRapida = null;
		for ( var ruta : rutas ) {
			if ( rutaMasRapida == null ) {
				rutaMasRapida = ruta;
			}else if ( ruta.minutosEnRuta() < rutaMasRapida.minutosEnRuta() ) {
				rutaMasRapida = ruta;
			}
		}
		return rutaMasRapida;
	}

	/*
	 * El método rutaMasRapida_1 utiliza programación funcional para buscar la ruta
	 * más rápida
	 * */
	public Ruta rutaMasRapida_1() {
		return rutas.stream().min( Comparator.comparing( Ruta::minutosEnRuta ) ).get();
	}
}
