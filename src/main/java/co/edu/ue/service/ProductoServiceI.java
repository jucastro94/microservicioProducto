package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Producto;

public interface ProductoServiceI {
	Producto addProducto(Producto producto, int usu);
	Producto UpdateProducto(Producto producto, int usu);
	boolean deleteIdProducto(int id, int usu);
	Producto searchProducto(int id);
	List<Producto>getAllProductos();
}
