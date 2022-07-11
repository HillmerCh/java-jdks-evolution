package co.hillmerch.evolution.refactor;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.hillmerch.evolution.refactor.entity.Contrato;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ContratoGeneratorTest {

	private static final Logger LOGGER = LogManager.getLogger( ContratoGeneratorTest.class );


	private final ContratoGenerator contratoGenerator = new ContratoGenerator();
	@Test
	void todos_los_contratos_son_generados(){
		List<Contrato> contratos = contratoGenerator.generar();
		LOGGER.info( "Contratos generados: {} " ,  contratos.size());
		assertEquals(5, contratos.size());
	}


}
