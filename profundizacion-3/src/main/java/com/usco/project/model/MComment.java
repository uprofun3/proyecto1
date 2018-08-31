package com.usco.project.model;

import com.usco.project.entity.Comment;

public class MComment {

	private long id;
	private long userId;
	private long site;
	private String content;
	private int reports;
	private int likes;
	private int dislikes;
	
	public MComment () {
		
	}
	
	public MComment(Comment comment) {
		
		this.id = comment.getId();
		this.userId = comment.getUserId();
		this.site = comment.getSite();
		this.content = comment.getContent();
		this.reports = comment.getReports();
		this.likes = comment.getLikes();
		this.dislikes = comment.getDislikes();
	}

	public MComment(long id, long userId, long site, String content, int reports, int likes, int dislikes) {
		super();
		this.id = id;
		this.userId = userId;
		this.site = site;
		this.content = content;
		this.reports = reports;
		this.likes = likes;
		this.dislikes = dislikes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getSite() {
		return site;
	}

	public void setSite(long site) {
		this.site = site;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReports() {
		return reports;
	}

	public void setReports(int reports) {
		this.reports = reports;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	
	
}
