package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.dao.ProductosUsuarioDaoI;
import co.edu.ue.model.ProductoUsuario;

public class ProductoUsuarioService implements ProductoUsuarioServiceI{
	 @Autowired
	 ProductosUsuarioDaoI productoUsuario;

	@Override
	public List<ProductoUsuario> buscarxUsuario(int cedula) {
		// TODO Auto-generated method stub
		return productoUsuario.buscarxUsuario(cedula);
	}

	@Override
	public List<ProductoUsuario> buscarxProducto(int idProducto) {
		// TODO Auto-generated method stub
		return productoUsuario.buscarxUsuario(idProducto);
	}

	@Override
	public ProductoUsuario addProductoUsuario(ProductoUsuario productoUsu) {
		// TODO Auto-generated method stub
		return productoUsuario.addProductoUsuario(productoUsu);
	}
	 
	

}
