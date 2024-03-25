package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.Disponibilidad;

public class DisponibilidadDao implements DisponibilidadDaoI{
	@Autowired
	DisponibilidadJPA disponibilidadJPA;

	@Override
	public Disponibilidad getDisponibilidad(int id) {
		return disponibilidadJPA.findById(id).orElse(null);
	}

	@Override
	public List<Disponibilidad> getAllDisponibilidad() {
		return disponibilidadJPA.findAll();
	}
	
}
