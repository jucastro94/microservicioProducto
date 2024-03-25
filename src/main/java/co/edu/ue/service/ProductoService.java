package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.ProductoDaoI;
import co.edu.ue.model.Producto;

@Service
public class ProductoService implements ProductoServiceI {
	@Autowired
	ProductoDaoI productoDao;
	
	@Override
	public Producto addProducto(Producto producto) {
		if(productoDao.searchProducto(producto.getIdProducto())==null) {
			productoDao.addProducto(producto);
			return producto;
		}
		return null;
	}

	@Override
	public Producto UpdateProducto(Producto producto) {
		if(productoDao.searchProducto(producto.getIdProducto())!=null) {
			productoDao.UpdateProducto(producto);
			return producto;
		}
		return null;
	}

	@Override
	public boolean deleteIdProducto(int id) {
		if(productoDao.searchProducto(id) == null ) {
			return false;
		}
		else {
			productoDao.deleteIdProducto(id);
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

}
