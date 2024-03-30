package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Producto>> getProductos(){
		List<Producto> dato= productoService.getAllProductos();
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<List<Producto>>(dato,headers,HttpStatus.OK);
	}
	@GetMapping(value="producto/{id}", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> getProducto(@PathVariable("id") int id) {
		Producto dato= productoService.searchProducto(id);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Producto>(dato,headers,HttpStatus.OK);
	}
	
	@PostMapping(value="addPoducto/{idUsu}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addProducto(@RequestBody Producto producto,@PathVariable("idUsu") int idUsu) {
		HttpHeaders headers = new HttpHeaders();
		
		if(productoService.searchProducto(producto.getIdProducto())!=null) {
			productoService.addProducto(producto, idUsu);
			return new ResponseEntity<Boolean>(true,headers,HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(false,headers,HttpStatus.NOT_FOUND);
		}
		
		
	}
	@PutMapping(value="updateProducto/{idUsu}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> updateProducto(@RequestBody Producto producto,@PathVariable("idUsu") int idUsu) {
		HttpHeaders headers = new HttpHeaders();
		if(productoService.searchProducto(producto.getIdProducto())!=null) {
			productoService.UpdateProducto(producto, idUsu);
			return new ResponseEntity<Boolean>(true,headers,HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(false,headers,HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(value="deleteProducto/{id}/{idUsu}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> deleteProducto(@PathVariable("id") int id,@PathVariable("idUsu") int idUsu) {
		HttpHeaders headers = new HttpHeaders();
		if(productoService.deleteIdProducto(id, idUsu)) {
			return new ResponseEntity<Boolean>(true,headers,HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(false,headers,HttpStatus.NOT_FOUND);
		}
		
		
	}
	
}
