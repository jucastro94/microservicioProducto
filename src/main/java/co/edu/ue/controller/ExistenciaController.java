package co.edu.ue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Existencia;
import co.edu.ue.service.ExistenciaServiceI;

@RestController
public class ExistenciaController {
	@Autowired
	ExistenciaServiceI existenciaService;
	
	@GetMapping(value="existencia/{idProducto}", produces =MediaType.APPLICATION_JSON_VALUE)
	public int getExistencia(@PathVariable("idProducto") int idProducto) {
		return existenciaService.getExistencia(idProducto);
	}
	@GetMapping(value="existencia/{idProducto}", produces =MediaType.APPLICATION_JSON_VALUE)
	public Existencia getDetalleExistencia(@PathVariable("idProducto") int idProducto) {
		return existenciaService.getDetalleExistencia(idProducto);
	}
	@PostMapping(value= "addExistencia", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Existencia addProducto(@RequestBody Existencia existencia) {
		return existenciaService.addExistencia(existencia);
	}
	@GetMapping(value="sumarExistencia/{idProducto}/{cantidad}", produces =MediaType.APPLICATION_JSON_VALUE)
	public Existencia sumarExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("cant") int cantidad) {
		return existenciaService.sumarExistencia(idProducto,cantidad);
	}
	@GetMapping(value="restarExistencia/{idProducto}/{cantidad}", produces =MediaType.APPLICATION_JSON_VALUE)
	public boolean restarExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("cant") int cantidad) {
		return existenciaService.restarExistencia(idProducto,cantidad);
	}
	
}
