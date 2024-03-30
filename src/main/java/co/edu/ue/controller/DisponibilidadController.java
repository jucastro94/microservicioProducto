package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Disponibilidad;
import co.edu.ue.service.DisponibilidadServiceI;

@RestController
public class DisponibilidadController {
	@Autowired
	DisponibilidadServiceI disponibilidadService;
	
	@GetMapping(value="disponibilidad", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Disponibilidad>> getAllDisponibilidad(){
		List<Disponibilidad> lista= disponibilidadService.getAllDisponibilidad();
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<List<Disponibilidad>>(lista,headers,HttpStatus.OK);
	}
	@GetMapping(value="disponibilidad/{idDisponibilidad}", produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Disponibilidad> getDisponibilidad(@PathVariable("idDisponibilidad") int id) {
		Disponibilidad dato = disponibilidadService.getDisponibilidad(id);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Disponibilidad>(dato,headers,HttpStatus.OK);
	}
	
}
