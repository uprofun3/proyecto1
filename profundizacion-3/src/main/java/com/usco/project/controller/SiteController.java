package com.usco.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usco.project.entity.Site;
import com.usco.project.model.MSite;
import com.usco.project.service.SiteService;



@RestController
@RequestMapping("/v1")
public class SiteController {

	@Autowired
	@Qualifier("servicio")
	private SiteService service;
	
	@PutMapping("/site")
	public boolean agregarSitio(@RequestBody Site site) {
		return service.crear(site);
	}
	
	@GetMapping("/site")
	public List<MSite> verTodo(){
		return service.obtener();
	}
}
