package co.edu.ue.dao;


import co.edu.ue.model.Existencia;

public interface ExistenciasDaoI {
	Existencia getDetalleExistencia(int id);
	Existencia updateExistencia(Existencia existencia);
	int getExistencia(int idProducto);
	Existencia getExistenciaPorProducto(int idProducto);
	Existencia addExistencia(Existencia existencia);
}
