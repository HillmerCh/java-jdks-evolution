package co.hillmerch.evolution.arting;

import java.util.List;

import co.hillmerch.evolution.arting.dao.SolicitudContratacionRepository;
import co.hillmerch.evolution.arting.entity.Contrato;
import co.hillmerch.evolution.arting.entity.SolicitudContratacion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContratoGenerator {


	private static final Logger LOGGER = LogManager.getLogger( ContratoGenerator.class );


	private SolicitudContratacionRepository solicitudContratacionRepository = new SolicitudContratacionRepository();

	public List<SolicitudContratacion> generar() {
		var solicitudContratacions =  consultarContratosSolicitados();
		var contratos = crearContratos( solicitudContratacions );

		LOGGER.info( "Contratos generados : {} " ,  contratos.size());

		var solicitudContratacionsActualizadas =  actualizarEstadoDeSolicitudContratacion(solicitudContratacions, contratos);
		enviarNotificacionParaFirmarDeContrato( contratos);
		return solicitudContratacions;
	}

	private void enviarNotificacionParaFirmarDeContrato(List<Contrato> contratos) {
		//MAIL
		//WHATSAPP
		//TELEGRAM
		//SMS
	}

	private List<SolicitudContratacion> actualizarEstadoDeSolicitudContratacion(List<SolicitudContratacion> solicitudContratacions, List<Contrato> contratos) {
		//return Collections.emptyList();

		for ( SolicitudContratacion solicitudContratacion : solicitudContratacions ) {
			solicitudContratacion.setEstado( SolicitudContratacion.Estado.GENERADO );
		}

		return solicitudContratacions;
	}

	private List<Contrato> crearContratos(List<SolicitudContratacion> solicitudContratacions) {
		return solicitudContratacions.stream().map( this::crearContrato ).toList();

		//return solicitudContratacions.stream().map( p -> crearContrato( p ) ).toList();

		/*var contratos = new ArrayList<Contrato>();
		for ( SolicitudContratacion solicitudContratacion : solicitudContratacions ) {
			Contrato contrato = this.crearContrato(solicitudContratacion);
			contratos.add(contrato);
		}
		return contratos;*/
	}

	private Contrato crearContrato(SolicitudContratacion solicitudContratacion) {
		return new Contrato();
	}

	private List<SolicitudContratacion> consultarContratosSolicitados() {
		return solicitudContratacionRepository.getSolicitudContratacionPendientes();
	}


}
