package com.proyectoWeb.Dao;
//Dao objeto de acceso a los datos
import com.proyectoWeb.domain.categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<categoria, Long>{
    
}