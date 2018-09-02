package com.usco.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usco.project.entity.Site;
import com.usco.project.model.MSite;
import com.usco.project.service.SiteService;


//Controlador para mostrar los servicios rest a un cliente
@RestController
@RequestMapping("/v1")
public class SiteController {

	//instancia de la clase SiteService para usar los metodos rest
	@Autowired
	@Qualifier("servicio")
	private SiteService service;
	
	//metodo de respuesta para una peticion PUT http la cual crea un sitio
	@PutMapping("/site")
	public boolean agregarSitio(@RequestBody Site site) {
		return service.crear(site);
	}
	
	//metodo de respuesta para una peticion Get http que muestra una lista de todos los sitios
	@GetMapping("/site")
	public List<MSite> verTodo(){
		return service.obtener();
	}
	
	//metodo de respuesta para una peticion get http que muestra una lista de sitios buscados por nombre
	@GetMapping("/site/name/{nombre}")
	public List<MSite> verPorNombre(@PathVariable("nombre") String nombre){
		
		return service.obtenerPorNombre(nombre);
	}
	
	//metodo de respuesta para una peticion Get http que muestra una lista de sitios buscados por categoria	
	@GetMapping("/site/category/{categoria}")
	public List<MSite> verPorCategoria(@PathVariable("categoria") int categoria){
		
		return service.obtenerPorCategoria(categoria);
	}
	//metodo de respuesta para una peticion Get http que muestra una lista de sitios buscados por ciudad	
	@GetMapping("/site/city/{ciudad}")
	public List<MSite> verPorCiudad(@PathVariable("ciudad") String ciudad){
		
		return service.obtenerPorCiudad(ciudad);
	}
	
	
}
