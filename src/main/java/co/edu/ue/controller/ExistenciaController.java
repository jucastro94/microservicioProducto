package co.edu.ue.controller;

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

import co.edu.ue.model.Existencia;
import co.edu.ue.service.ExistenciaServiceI;

@RestController
public class ExistenciaController {
	@Autowired
	ExistenciaServiceI existenciaService;
	
	@GetMapping(value="existencia/{idProducto}/{idUsu}", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> getExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("idUsu") int idUsu) {
		int dato= existenciaService.getExistencia(idProducto, idUsu);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Integer>(dato,headers,HttpStatus.OK);
	}
	@GetMapping(value="existenciaDetalle/{idProducto}/{idUsu}", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Existencia> getDetalleExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("idUsu") int idUsu) {
		Existencia dato= existenciaService.getDetalleExistencia(idProducto, idUsu);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Existencia>(dato,headers,HttpStatus.OK);
	}
	@PostMapping(value= "addExistencia/{idUsu}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Existencia> addProducto(@RequestBody Existencia existencia,@PathVariable("idUsu") int idUsu) {
		Existencia dato= existenciaService.addExistencia(existencia, idUsu);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Existencia>(dato,headers,HttpStatus.OK);
	}
	@GetMapping(value="sumarExistencia/{idProducto}/{cantidad}/{idUsu}", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Existencia> sumarExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("cant") int cantidad,@PathVariable("idUsu") int idUsu) {
		Existencia dato= existenciaService.sumarExistencia(idProducto,cantidad, idUsu);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Existencia>(dato,headers,HttpStatus.OK);
	}
	@GetMapping(value="restarExistencia/{idProducto}/{cantidad}/{idUsu}", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> restarExistencia(@PathVariable("idProducto") int idProducto,@PathVariable("cant") int cantidad,@PathVariable("idUsu") int idUsu) {
		HttpHeaders headers = new HttpHeaders();
		if (existenciaService.restarExistencia(idProducto,cantidad, idUsu)){
			return new ResponseEntity<Boolean>(true,headers,HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(false,headers,HttpStatus.NOT_FOUND);
		}
	}
	
}
