package co.edu.ue.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Producto;

public interface ProductoJPA extends JpaRepository<Producto, Integer>{

}
