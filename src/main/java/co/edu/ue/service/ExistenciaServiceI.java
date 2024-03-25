package co.edu.ue.service;

import co.edu.ue.model.Existencia;

public interface ExistenciaServiceI{
	Existencia sumarExistencia(int id, int cant);
	boolean restarExistencia(int id, int cant);
	Existencia getDetalleExistencia(int id);
	int getExistencia(int id);
	Existencia addExistencia(Existencia existencia);
}
