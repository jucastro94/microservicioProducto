package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.model.Producto;

@Repository
public class ProductoDao implements ProductoDaoI{

	@Autowired
	ProductoJPA productoJPA;
	
	@Override
	public Producto addProducto(Producto producto) {
		
		return productoJPA.save(producto);
	}

	@Override
	public Producto UpdateProducto(Producto producto) {
		
		return productoJPA.save(producto);
	}

	@Override
	public void deleteIdProducto(int id) {
		productoJPA.deleteById(id);
	}

	@Override
	public Producto searchProducto(int id) {
		return productoJPA.findById(id).orElse(null);
	}

	@Override
	public List<Producto> getAllProductos() {
		return productoJPA.findAll();
	}
	
}
