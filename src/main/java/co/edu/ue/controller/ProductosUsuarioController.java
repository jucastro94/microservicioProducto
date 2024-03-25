package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.ProductoUsuario;
import co.edu.ue.service.ProductoUsuarioServiceI;

@RestController
public class ProductosUsuarioController {
	@Autowired
	ProductoUsuarioServiceI productoUsuarioService;
	
	@GetMapping(value="productosxusuario/{cedula}", produces =MediaType.APPLICATION_JSON_VALUE)
	public List<ProductoUsuario> getProductosxUsuario(@PathVariable("cedula") int cedula){
		return productoUsuarioService.buscarxUsuario(cedula);
	}
	@GetMapping(value="usuariosxproducto/{idproducto}", produces =MediaType.APPLICATION_JSON_VALUE)
	public List<ProductoUsuario> getUsuariosxProducto(@PathVariable("idproducto") int idproducto){
		return productoUsuarioService.buscarxUsuario(idproducto);
	}
	@PostMapping(value="addPoductoxUsuario", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductoUsuario addPoductoxUsuario(@RequestBody ProductoUsuario ProducUsu) {
		return productoUsuarioService.addProductoUsuario(ProducUsu);
	}
}
