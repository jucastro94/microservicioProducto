package co.edu.ue.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Existencia;

public interface ExistenciaJPA extends JpaRepository<Existencia, Integer>{
	Existencia findByFK_producto(int idProcucto);
}
