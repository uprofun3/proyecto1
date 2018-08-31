package com.usco.project.repository;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.usco.project.entity.Site;

@Repository("repositorio")
public interface SiteRepository extends JpaRepository<Site, Serializable>, PagingAndSortingRepository<Site, Serializable>{

	public abstract Site findById(long id);
	public abstract Site findByName(String name);
	public abstract Page<Site> findAll(Pageable pageable);
	
}
