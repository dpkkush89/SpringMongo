package com.dktech.joblisting.modal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="SpringMongo")
public class Post {
	private String profile;
	private String desc;
	private int exp;
	private String techs [];
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
		
	
}
