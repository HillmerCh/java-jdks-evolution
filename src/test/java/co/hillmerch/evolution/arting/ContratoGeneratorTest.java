package co.hillmerch.evolution.arting;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.hillmerch.evolution.arting.entity.SolicitudContratacion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class ContratoGeneratorTest {

	private static final Logger LOGGER = LogManager.getLogger( ContratoGeneratorTest.class );


	private final ContratoGenerator contratoGenerator = new ContratoGenerator();
	@Test
	void todos_los_contratos_son_generados(){
		List<SolicitudContratacion> solicitudContratacions = contratoGenerator.generar();
		LOGGER.info( "Solicitudes de contratación procesadas: {} " ,  solicitudContratacions.size());
		LOGGER.debug( "Estado de solicitudes de contratación procesadas: {} " ,  solicitudContratacions.stream().map( SolicitudContratacion::getEstado ).toList());

		assertFalse(solicitudContratacions.isEmpty());
		assertTrue( solicitudContratacions.stream().allMatch( this::isSolicitudContratacionPendiente ) );

	}

	private boolean isSolicitudContratacionPendiente(SolicitudContratacion solicitudContratacion) {
		return solicitudContratacion.getEstado().equals( SolicitudContratacion.Estado.GENERADO );
	}


}
