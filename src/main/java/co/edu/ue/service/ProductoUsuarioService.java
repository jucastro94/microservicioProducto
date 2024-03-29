package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.ProductosUsuarioDaoI;
import co.edu.ue.model.Log;
import co.edu.ue.model.Productousuario;

@Service
public class ProductoUsuarioService implements ProductoUsuarioServiceI{
	 @Autowired
	 ProductosUsuarioDaoI productoUsuario;
	 @Autowired
	 LogServiceI log;
	@Override
	public List<Productousuario> buscarxUsuario(int cedula) {
		// TODO Auto-generated method stub
		return productoUsuario.buscarxUsuario(cedula);
	}

	@Override
	public List<Productousuario> buscarxProducto(int idProducto) {
		// TODO Auto-generated method stub
		return productoUsuario.buscarxUsuario(idProducto);
	}

	@Override
	public Productousuario addProductoUsuario(Productousuario productoUsu, int usu) {
		registarLog(usu,"insert","agrega producto: "+productoUsu.getFK_producto()+" al usuario "+productoUsu.getFK_usuario());
		return productoUsuario.addProductoUsuario(productoUsu);
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
