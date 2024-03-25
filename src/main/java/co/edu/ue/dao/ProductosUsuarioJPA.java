package co.edu.ue.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.ProductoUsuario;

public interface ProductosUsuarioJPA extends JpaRepository<ProductoUsuario, Integer> {
	List<ProductoUsuario> findByFK_producto(int fK_producto);
	List<ProductoUsuario> findByFK_usuario(int fK_usuario);
}
