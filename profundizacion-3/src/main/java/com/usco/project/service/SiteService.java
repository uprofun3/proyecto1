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

@Service("servicio")
public class SiteService {

	@Autowired
	@Qualifier("repositorio")
	private SiteRepository repository;
	
	
	@Autowired
	@Qualifier("convertidor")
	private Converter converter;
	
	private static final Log logger = LogFactory.getLog(SiteService.class);
	
	public boolean crear (Site site) {
		logger.info("Creando sitio");
		try {
			repository.save(site);
			return true;
		}catch(Exception e){
			logger.error("Error al crear sitio");
			return false;
		}
	}
	
	public List<MSite> obtener(){
		
		return converter.convertSiteToModel(repository.findAll());
	}
}
