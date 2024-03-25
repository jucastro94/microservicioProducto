package co.edu.ue.dao;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.Existencia;

public class ExistenciaDao implements ExistenciasDaoI{
	@Autowired
	ExistenciaJPA existenciaJPA;
	
	@Override
	public Existencia getDetalleExistencia(int id) {
		// TODO Auto-generated method stub
		return existenciaJPA.findById(id).orElse(null);
	}

	@Override
	public Existencia updateExistencia(Existencia existencia) {
		return existenciaJPA.save(existencia);
	}

	@Override
	public int getExistencia(int idProducto) {
		// TODO Auto-generated method stub
		return getExistenciaPorProducto(idProducto).getIdExistencias();
	}

	@Override
	public Existencia getExistenciaPorProducto(int idProducto) {
		// TODO Auto-generated method stub
		if (existenciaJPA.findByFK_producto(idProducto) != null) {
			return existenciaJPA.findByFK_producto(idProducto);
		}
		return null;
	}

	@Override
	public Existencia addExistencia(Existencia existencia) {
		// TODO Auto-generated method stub
		return existenciaJPA.save(existencia);
	}

}
