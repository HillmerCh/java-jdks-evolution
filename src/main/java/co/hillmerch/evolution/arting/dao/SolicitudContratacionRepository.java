package co.hillmerch.evolution.arting.dao;

import java.util.List;

import co.hillmerch.evolution.arting.database.LocalInMemoryDB;
import co.hillmerch.evolution.arting.entity.SolicitudContratacion;

public class SolicitudContratacionRepository {


	private LocalInMemoryDB localInMemoryDB = new LocalInMemoryDB();

	public List<SolicitudContratacion> getSolicitudContratacionPendientes() {
		return localInMemoryDB.getSolicitudContratacions().stream()
				.filter( SolicitudContratacionRepository::isSolicitudContratacionPendiente ).toList();
	}

	private static boolean isSolicitudContratacionPendiente(SolicitudContratacion solicitudContratacion) {
		return solicitudContratacion.getEstado().equals( SolicitudContratacion.Estado.PENDIENTE );
	}


}
