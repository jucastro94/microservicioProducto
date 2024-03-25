package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.ProductoUsuario;

public class ProductosUsuarioDao implements ProductosUsuarioDaoI {
	@Autowired
	ProductosUsuarioJPA productosUsuarioJPA;

	@Override
	public List<ProductoUsuario> buscarxUsuario(int cedula) {
		// TODO Auto-generated method stub
		return productosUsuarioJPA.findByFK_usuario(cedula);
	}

	@Override
	public List<ProductoUsuario> buscarxProducto(int idProducto) {
		// TODO Auto-generated method stub
		return productosUsuarioJPA.findByFK_producto(idProducto);
	}

	@Override
	public ProductoUsuario addProductoUsuario(ProductoUsuario productoUsuario) {
		// TODO Auto-generated method stub
		return productosUsuarioJPA.save(productoUsuario);
	}


	
}
