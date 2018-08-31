package com.usco.project.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.usco.project.entity.Calification;
import com.usco.project.entity.Category;
import com.usco.project.entity.Comment;
import com.usco.project.entity.FavoriteSite;
import com.usco.project.entity.Image;
import com.usco.project.entity.PendingSite;
import com.usco.project.entity.Site;
import com.usco.project.entity.TimeTable;
import com.usco.project.entity.User;
import com.usco.project.model.MCalification;
import com.usco.project.model.MCategory;
import com.usco.project.model.MComment;
import com.usco.project.model.MFavoriteSite;
import com.usco.project.model.MImage;
import com.usco.project.model.MPendingSite;
import com.usco.project.model.MSite;
import com.usco.project.model.MTimeTable;
import com.usco.project.model.MUser;



@Component("convertidor")
public class Converter {

	public List<MCalification> convertCalificationToModel(List<Calification> califications){
		List<MCalification> mcalifications = new ArrayList<>();
		
		for (Calification calification: califications) {	
			mcalifications.add(new MCalification(calification));
		} 
		return mcalifications;
	}
	
	public List<MCategory> convertCategoryToModel(List<Category> categories){
		List<MCategory> mcategories = new ArrayList<>();
		
		for (Category category: categories) {	
			mcategories.add(new MCategory(category));
		} 
		return mcategories;
	}
	
	public List<MComment> convertCommentToModel(List<Comment> comments){
		List<MComment> mcomments = new ArrayList<>();
		
		for (Comment comment: comments) {	
			mcomments.add(new MComment(comment));
		} 
		return mcomments;
	}
	
	public List<MFavoriteSite> convertFavoriteSiteToModel(List<FavoriteSite> favoriteSites){
		List<MFavoriteSite> mfavoriteSites = new ArrayList<>();
		
		for (FavoriteSite favoriteSite: favoriteSites) {	
			mfavoriteSites.add(new MFavoriteSite(favoriteSite));
		} 
		return mfavoriteSites;
	}
	
	public List<MImage> convertImageToModel(List<Image> images){
		List<MImage> mimages = new ArrayList<>();
		
		for (Image image: images) {	
			mimages.add(new MImage(image));
		} 
		return mimages;
	}
	
	public List<MPendingSite> convertPendingSiteToModel(List<PendingSite> pendingSites){
		List<MPendingSite> mpendingSites = new ArrayList<>();
		
		for (PendingSite pendingSite: pendingSites) {	
			mpendingSites.add(new MPendingSite(pendingSite));
		} 
		return mpendingSites;
	}
	
	public List<MSite> convertSiteToModel(List<Site> sites){
		List<MSite> msites = new ArrayList<>();
		
		for (Site site: sites) {	
			msites.add(new MSite(site));
		} 
		return msites;
	}
	
	public List<MTimeTable> convertTimeTableToModel(List<TimeTable> timeTables){
		List<MTimeTable> mtimeTables = new ArrayList<>();
		
		for (TimeTable timeTable: timeTables) {	
			mtimeTables.add(new MTimeTable(timeTable));
		} 
		return mtimeTables;
	}
	
	public List<MUser> convertUserToModel(List<User> users){
		List<MUser> musers = new ArrayList<>();
		
		for (User user: users) {	
			musers.add(new MUser(user));
		} 
		return musers;
	}
	
}
