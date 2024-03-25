package co.edu.ue.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.dao.ExistenciasDaoI;
import co.edu.ue.model.Existencia;

public class ExistenciaService implements ExistenciaServiceI {
	@Autowired
	ExistenciasDaoI existenciaDao;
	@Autowired
	ProductoServiceI Producto;

	@Override
	public Existencia sumarExistencia(int idProducto, int cant) {
		Existencia existencia = new Existencia();
		if(Producto.searchProducto(idProducto)!=null) {
			existencia=getDetalleExistencia(idProducto);
			existencia.setExistencias(existencia.getExistencias()+cant);
			return existenciaDao.updateExistencia(existencia);
		}
		return null;
	}

	@Override
	public boolean restarExistencia(int idProducto, int cant) {
		Existencia existencia = new Existencia();
		if(Producto.searchProducto(idProducto)!=null) {
			existencia=getDetalleExistencia(idProducto);
			if(existencia.getExistencias() >= cant ) {
				existencia.setExistencias(existencia.getExistencias()-cant);
				existenciaDao.updateExistencia(existencia);
				return true;
			}
		}
		return false;
	}

	@Override
	public Existencia getDetalleExistencia(int idProducto) {
		if(Producto.searchProducto(idProducto)!=null) {
			return existenciaDao.getDetalleExistencia(idProducto);
		}
		return null;
	}

	@Override
	public int getExistencia(int id) {
		return existenciaDao.getExistencia(id);
	}

	@Override
	public Existencia addExistencia(Existencia existencia) {
		if(Producto.searchProducto(existencia.getFK_producto())!=null) {
			if(getDetalleExistencia(existencia.getFK_producto())==null) {
				return existenciaDao.addExistencia(existencia);
			}
		}
		return null;
	}
}
