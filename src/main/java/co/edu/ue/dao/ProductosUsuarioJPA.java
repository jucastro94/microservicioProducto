package co.edu.ue.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.ue.model.Productousuario;

public interface ProductosUsuarioJPA extends JpaRepository<Productousuario, Integer> {
    @Query("SELECT e FROM Productousuario e WHERE e.FK_producto = :fK_producto")
	List<Productousuario> findByFK_producto(int fK_producto);
    
    @Query("SELECT e FROM Productousuario e WHERE e.FK_usuario = :fK_usuario")
	List<Productousuario> findByFK_usuario(int fK_usuario);
}
