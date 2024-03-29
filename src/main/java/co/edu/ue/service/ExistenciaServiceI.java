package co.edu.ue.service;

import co.edu.ue.model.Existencia;

public interface ExistenciaServiceI{
	Existencia sumarExistencia(int id, int cant, int usu);
	boolean restarExistencia(int id, int cant, int usu);
	Existencia getDetalleExistencia(int id, int usu);
	int getExistencia(int id, int usu);
	Existencia addExistencia(Existencia existencia, int usu);
}
