package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Producto;

public interface ProductoServiceI {
	Producto addProducto(Producto producto);
	Producto UpdateProducto(Producto producto);
	boolean deleteIdProducto(int id);
	Producto searchProducto(int id);
	List<Producto>getAllProductos();
}
