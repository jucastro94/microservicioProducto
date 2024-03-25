package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Producto;

public interface ProductoDaoI {
	Producto addProducto(Producto producto);
	Producto UpdateProducto(Producto producto);
	void deleteIdProducto(int id);
	Producto searchProducto(int id);
	List<Producto>getAllProductos();
	
}
