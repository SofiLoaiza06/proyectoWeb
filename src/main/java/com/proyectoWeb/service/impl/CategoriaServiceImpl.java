
package com.proyectoWeb.service.impl;

import com.proyectoWeb.Dao.CategoriaDao;
import com.proyectoWeb.domain.categoria;
import com.proyectoWeb.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class CategoriaServiceImpl implements CategoriaService{

    
    //La anotacion autowired crea un unico objeto mientras se ejecuta el app
    @Autowired
    private CategoriaDao categoriaDao;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<categoria> getcategoria(boolean activos) {
      var lista=categoriaDao.findAll();
      if(activos){//se deben eliminar los que no estan activos
          lista.removeIf(e -> !e.isActivo());
      }
      return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public categoria getCategoria(categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(categoria categoria) {
        categoriaDao.delete(categoria);
    }
    
}
