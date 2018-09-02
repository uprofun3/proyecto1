package com.usco.project.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.usco.project.entity.Site;

//Respositorio spring el cual contendra todos los metodos de consulta para la entidad Sitio
@Repository("repositorio")

// una interfaz que hereda todos los metodos de la clase JpaRepository para hacer consultas a las bases de datos
// se importa serializable pues los datos van a pasar en red
//PagingAndSortingRepository para hacer paginacion con las consultas realizadas
public interface SiteRepository extends JpaRepository<Site, Serializable>, PagingAndSortingRepository<Site, Serializable>{

	//metodo para encontrar un sitio por el id
	public abstract Site findById(long id);
	
	//metodo para encontrar un sitio por el nombre, devuelve una lista de sitios con el nombre
	public abstract List<Site> findByName(String name);
	
	//metodo para encontrar un sitio por categoria
	public abstract List<Site> findByCategory(int category);
	
	//metodo para encontrar un sitio por ciudad
	public abstract List<Site> findByCity(String city);
	
}
