package co.edu.ue.dao;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.ue.model.Existencia;

public interface ExistenciaJPA extends JpaRepository<Existencia, Integer>{
    @Query("SELECT FK_producto FROM Existencia e WHERE e.FK_producto = :fK_producto")
	Existencia findByFK_producto(int fK_producto);
	//List<Existencia> findByFK_producto(int fK_producto);
}
