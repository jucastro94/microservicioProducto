package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Disponibilidad;

public interface DisponibilidadServiceI {
	 Disponibilidad getDisponibilidad(int id);
	 List<Disponibilidad>getAllDisponibilidad();
}
