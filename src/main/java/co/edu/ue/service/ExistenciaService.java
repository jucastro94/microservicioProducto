package co.edu.ue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.ExistenciasDaoI;
import co.edu.ue.model.Existencia;
import co.edu.ue.model.Log;

@Service
public class ExistenciaService implements ExistenciaServiceI {
	@Autowired
	ExistenciasDaoI existenciaDao;
	@Autowired
	ProductoServiceI Producto;
	@Autowired
	LogServiceI log;
	@Override
	public Existencia sumarExistencia(int idProducto, int cant, int usu) {
		Existencia existencia = new Existencia();
		if(Producto.searchProducto(idProducto)!=null) {
			existencia=getDetalleExistencia(idProducto,usu);
			existencia.setExistencias(existencia.getExistencias()+cant);
			registarLog(usu,"update","añade "+ cant+" existencias, producto: "+idProducto);
			return existenciaDao.updateExistencia(existencia);
		}
		return null;
	}

	@Override
	public boolean restarExistencia(int idProducto, int cant, int usu) {
		Existencia existencia = new Existencia();
		if(Producto.searchProducto(idProducto)!=null) {
			existencia=getDetalleExistencia(idProducto, usu);
			if(existencia.getExistencias() >= cant ) {
				existencia.setExistencias(existencia.getExistencias()-cant);
				existenciaDao.updateExistencia(existencia);
				registarLog(usu,"update","resta "+ cant+" existencias, producto: "+idProducto);
				return true;
			}
		}
		return false;
	}

	@Override
	public Existencia getDetalleExistencia(int idProducto, int usu) {
		if(Producto.searchProducto(idProducto)!=null) {
			return existenciaDao.getDetalleExistencia(idProducto);
		}
		return null;
	}

	@Override
	public int getExistencia(int id, int usu) {
		return existenciaDao.getExistencia(id);
	}

	@Override
	public Existencia addExistencia(Existencia existencia, int usu) {
		if(Producto.searchProducto(existencia.getFK_producto())!=null) {
			if(getDetalleExistencia(existencia.getFK_producto(), usu)==null) {
				registarLog(usu,"insert","añade existencias");
				return existenciaDao.addExistencia(existencia);
			}
		}
		return null;
	}
	
	private void registarLog(int usu, String accion, String observacion) {
		Log lg = new Log();
		lg.setAccion(accion);
		lg.setIdUsuario(usu);
		lg.setFecha(log.obtenerFecha());
		lg.setObservacion(observacion);
		log.addLog(lg);
	}
}
