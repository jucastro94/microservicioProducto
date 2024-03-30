package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Productousuario;
import co.edu.ue.service.ProductoUsuarioServiceI;

@RestController
public class ProductosUsuarioController {
	@Autowired
	ProductoUsuarioServiceI productoUsuarioService;
	
	@GetMapping(value="productosxusuario/{cedula}", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Productousuario>> getProductosxUsuario(@PathVariable("cedula") int cedula){
		List<Productousuario> dato= productoUsuarioService.buscarxUsuario(cedula);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<List<Productousuario>>(dato,headers,HttpStatus.OK);
	}
	@GetMapping(value="usuariosxproducto/{idproducto}", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Productousuario>> getUsuariosxProducto(@PathVariable("idproducto") int idproducto){
		List<Productousuario> dato= productoUsuarioService.buscarxUsuario(idproducto);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<List<Productousuario>>(dato,headers,HttpStatus.OK);
	}
	@PostMapping(value="addPoductoxUsuario/{cedula}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addPoductoxUsuario(@RequestBody Productousuario ProducUsu,@PathVariable("cedula") int idUsu) {
		/*System.out.println("------------"+idUsu);
		System.out.println("------------"+ProducUsu.getFK_producto());
		System.out.println("------------"+ProducUsu.getFK_usuario());*/
		HttpHeaders headers = new HttpHeaders();
		productoUsuarioService.addProductoUsuario(ProducUsu,idUsu);
		return new ResponseEntity<Boolean>(true,headers,HttpStatus.OK);
	}
}
