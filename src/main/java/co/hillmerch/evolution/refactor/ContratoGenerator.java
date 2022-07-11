package co.hillmerch.evolution.refactor;

import java.util.List;

import co.hillmerch.evolution.refactor.dao.SolicitudContratacionRepository;
import co.hillmerch.evolution.refactor.entity.Contrato;
import co.hillmerch.evolution.refactor.entity.SolicitudContratacion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContratoGenerator {

	/*
	* 1. Se consultan las solicitudes de contratación
	* 2. Se crean los contratos para cada solicitud
	* 3. Se envian la notificación de los contratos creados
	* */
	private static final Logger LOGGER = LogManager.getLogger( ContratoGenerator.class );

	private SolicitudContratacionRepository solicitudContratacionRepository = new SolicitudContratacionRepository();

	public List<Contrato> generar() {
		var solicitudContratacions =  consultarContratosSolicitados();
		var contratos = crearContratos( solicitudContratacions );

		LOGGER.info( "Contratos generados : {} " ,  contratos.size());

		enviarNotificacionParaFirmarDeContrato( contratos);
		return contratos;
	}

	private void enviarNotificacionParaFirmarDeContrato(List<Contrato> contratos) {
		//MAIL
		//WHATSAPP
		//TELEGRAM
		//SMS
	}

	private List<Contrato> crearContratos(List<SolicitudContratacion> solicitudContratacions) {
		return solicitudContratacions.stream().filter(SolicitudContratacion::isSolicitudContratacionPendiente).map( this::crearContrato ).toList();

		/*
		//Version 3
		return solicitudContratacions.stream().filter( p->p.getEstado().equals( SolicitudContratacion.Estado.PENDIENTE ) ).map( this::crearContrato ).toList();
		 */

		/*
		//Version 2
		return solicitudContratacions.stream().map( p -> crearContrato( p ) ).toList();
		 */

		/*
		//Version 1
		var contratos = new ArrayList<Contrato>();
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
