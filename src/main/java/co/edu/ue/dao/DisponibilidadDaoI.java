package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Disponibilidad;

public interface DisponibilidadDaoI {
   Disponibilidad getDisponibilidad(int id);
   List<Disponibilidad>getAllDisponibilidad();
}
