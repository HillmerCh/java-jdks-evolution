package co.hillmerch.evolution.refactor.dao;

import java.util.List;

import co.hillmerch.evolution.refactor.database.LocalInMemoryDB;
import co.hillmerch.evolution.refactor.entity.SolicitudContratacion;

public class SolicitudContratacionRepository {


	private LocalInMemoryDB localInMemoryDB = new LocalInMemoryDB();

	public List<SolicitudContratacion> getSolicitudContratacionPendientes() {
		return localInMemoryDB.getSolicitudContratacions().stream().toList();
	}

}
