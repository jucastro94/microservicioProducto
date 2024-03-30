package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.ProductoDaoI;
import co.edu.ue.model.Log;
import co.edu.ue.model.Producto;

@Service
public class ProductoService implements ProductoServiceI {
	@Autowired
	ProductoDaoI productoDao;
	@Autowired
	LogServiceI log;
	
	@Override
	public Producto addProducto(Producto producto, int usu) {
		if(productoDao.searchProducto(producto.getIdProducto())==null) {
			productoDao.addProducto(producto);
			registarLog(usu,"insert","agrega producto: "+producto.getNombre());
			return producto;
		}
		return null;
	}

	@Override
	public Producto UpdateProducto(Producto producto, int usu) {
		if(productoDao.searchProducto(producto.getIdProducto())!=null) {
			productoDao.UpdateProducto(producto);
			registarLog(usu,"update","modifica producto: "+producto.getIdProducto());
			return producto;
		}
		return null;
	}

	@Override
	public boolean deleteIdProducto(int id, int usu) {
		if(productoDao.searchProducto(id) == null ) {
			return false;
		}
		else {
			productoDao.deleteIdProducto(id);
			registarLog(usu,"delete","elimina producto: "+id);
			return true;
		}
	}

	@Override
	public Producto searchProducto(int id) {
		return productoDao.searchProducto(id);
	}

	@Override
	public List<Producto> getAllProductos() {
		return productoDao.getAllProductos();
	}
	
	private void registarLog(int usu, String accion, String observacion) {
		Log lg = new Log();
		lg.setAccion(accion);
		lg.setIdUsuario(usu);
		lg.setFecha(lg.obtenerFecha());
		lg.setObservacion(observacion);
		//System.out.println("------------------"+lg.obtenerFecha()+"-----------------");
		log.addLog(lg);
	}

}
