package co.edu.ue.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.DisponibilidadDaoI;
import co.edu.ue.model.Disponibilidad;

@Service
public class DisponibilidadService implements DisponibilidadServiceI{
	@Autowired
	DisponibilidadDaoI disponibilidadDao;
	
	@Override
	public Disponibilidad getDisponibilidad(int id) {
		return disponibilidadDao.getDisponibilidad(id);
	}

	@Override
	public List<Disponibilidad> getAllDisponibilidad() {
		return disponibilidadDao.getAllDisponibilidad();
	}

}
