package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.model.Productousuario;

@Repository
public class ProductosUsuarioDao implements ProductosUsuarioDaoI {
	@Autowired
	ProductosUsuarioJPA productosUsuarioJPA;

	@Override
	public List<Productousuario> buscarxUsuario(int cedula) {
		// TODO Auto-generated method stub
		return productosUsuarioJPA.findByFK_usuario(cedula);
	}

	@Override
	public List<Productousuario> buscarxProducto(int idProducto) {
		// TODO Auto-generated method stub
		return productosUsuarioJPA.findByFK_producto(idProducto);
	}

	@Override
	public Productousuario addProductoUsuario(Productousuario productoUsuario) {
		// TODO Auto-generated method stub
		return productosUsuarioJPA.save(productoUsuario);
	}


	
}
