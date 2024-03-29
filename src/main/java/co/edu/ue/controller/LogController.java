package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Log;
import co.edu.ue.service.LogServiceI;

@RestController
public class LogController {
	@Autowired
	LogServiceI logService;
	
	@GetMapping(value="log/{id}", produces =MediaType.APPLICATION_JSON_VALUE)
	public Log getLog(@PathVariable("id") int id) {
		return logService.getLog(id);
	}
	@GetMapping(value="logs", produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Log> getProductos(){
		return logService.getAllLog();
	}
	@PostMapping(value="addLog", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Log addlog(@RequestBody Log log) {
		return logService.addLog(log);
	}
	
}
