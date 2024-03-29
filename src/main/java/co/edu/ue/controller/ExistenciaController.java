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
	
	@GetMapping(value="existencia/{idProducto}/{idUsu}", produces =MediaType.APPLICATION_JSON_VALUE)
	public int getExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("idUsu") int idUsu) {
		return existenciaService.getExistencia(idProducto, idUsu);
	}
	@GetMapping(value="existenciaDetalle/{idProducto}/{idUsu}", produces =MediaType.APPLICATION_JSON_VALUE)
	public Existencia getDetalleExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("idUsu") int idUsu) {
		return existenciaService.getDetalleExistencia(idProducto, idUsu);
	}
	@PostMapping(value= "addExistencia/{idUsu}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Existencia addProducto(@RequestBody Existencia existencia,@PathVariable("idUsu") int idUsu) {
		return existenciaService.addExistencia(existencia, idUsu);
	}
	@GetMapping(value="sumarExistencia/{idProducto}/{cantidad}/{idUsu}", produces =MediaType.APPLICATION_JSON_VALUE)
	public Existencia sumarExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("cant") int cantidad,@PathVariable("idUsu") int idUsu) {
		return existenciaService.sumarExistencia(idProducto,cantidad, idUsu);
	}
	@GetMapping(value="restarExistencia/{idProducto}/{cantidad}/{idUsu}", produces =MediaType.APPLICATION_JSON_VALUE)
	public boolean restarExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("cant") int cantidad,@PathVariable("idUsu") int idUsu) {
		return existenciaService.restarExistencia(idProducto,cantidad, idUsu);
	}
	
}
