package com.usco.project.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.usco.project.converter.Converter;
import com.usco.project.entity.Site;
import com.usco.project.model.MSite;
import com.usco.project.repository.SiteRepository;

//Servicios rest para La tabla sitios
@Service("servicio")
public class SiteService {

	//Instacia del repositorio de sitios
	@Autowired
	@Qualifier("repositorio")
	private SiteRepository repository;
	
	//Instancia del convertidor de entidades a modelos
	@Autowired
	@Qualifier("convertidor")
	private Converter converter;
	
	//Log para mostrar en el terminal lo que se esta ejecutando
	private static final Log logger = LogFactory.getLog(SiteService.class);
	
	//metodo para crear un sitio y almacenarlo en la base de datos retorna un boolean que dice si se creo o no el sitio
	public boolean crear (Site site) {
		//logger para informar en el terminal que se esta creando un sitio
		logger.info("Creando sitio");
		try {
			//metodo del JpaRepository save  para almacenar un sitio a la base de datos si sale bien retorna true
			repository.save(site);
			return true;
		}catch(Exception e){
			//Logger para informar en el terminal que hubo al creal el sitio retorna false 
			logger.error("Error al crear sitio");
			return false;
		}
	}
	
	//Metodo para obtener una lista del modelo sitio 
	public List<MSite> obtener(){
		
		//retorna la entidades de sitios convertidas a modelos
		return converter.convertSiteToModel(repository.findAll());
	}
	
	//Servicio para obtener un sitio por nombre
	public List<MSite> obtenerPorNombre(String nombre){
		
		//se usa el metodo del repositorio findByName para buscar sitios por nombre y se convirte a modelo para retornarlo
		return converter.convertSiteToModel(repository.findByName(nombre));
	}
	
	//Servicio para obtener un sitio por categoria
	public List<MSite> obtenerPorCategoria(int categoria){
		
		return converter.convertSiteToModel(repository.findByCategory(categoria));
	}
	
	//Servicio para obtener un sitio por ciudad
	public List<MSite> obtenerPorCiudad(String ciudad){
		
		return converter.convertSiteToModel(repository.findByCity(ciudad));
	}
}
