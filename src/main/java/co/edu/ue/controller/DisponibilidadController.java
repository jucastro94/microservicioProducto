package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
	public List<Disponibilidad> getAllDisponibilidad(){
		return disponibilidadService.getAllDisponibilidad();
	}
	@GetMapping(value="disponibilidad/{idDisponibilidad}", produces =MediaType.APPLICATION_JSON_VALUE)
	public Disponibilidad getDisponibilidad(@PathVariable("idDisponibilidad") int id) {
		return disponibilidadService.getDisponibilidad(id);
	}
	
}
