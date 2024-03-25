package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Producto;
import co.edu.ue.service.ProductoServiceI;

@RestController
public class ProductoController {
	@Autowired
	ProductoServiceI productoService;
	
	@GetMapping(value="productos", produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> getProductos(){
		return productoService.getAllProductos();
	}
	@GetMapping(value="producto/{id}", produces =MediaType.APPLICATION_JSON_VALUE)
	public Producto getProducto(@PathVariable("id") int id) {
		return productoService.searchProducto(id);
	}
	
	@PostMapping(value="addPoducto", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Producto addProducto(@RequestBody Producto producto) {
		return productoService.addProducto(producto);
	}
	@PutMapping(value="updateProducto", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Producto updateProducto(@RequestBody Producto producto) {
		return productoService.UpdateProducto(producto);
	}
	@DeleteMapping(value="deleteProducto", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean deleteProducto(@PathVariable("id") int id) {
		return productoService.deleteIdProducto(id);
	}
	
}
