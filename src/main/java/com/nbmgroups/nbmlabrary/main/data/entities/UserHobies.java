package com.nbmgroups.nbmlabrary.main.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userhobies")
public class UserHobies {
	@Id
	private Integer UserId;
	private String Sport;
	private String Indoor;
	private String  Author;	
	private String  Novel;
	private String  Player;
	private String  hobiles;
	
	
	public UserHobies(Integer userId, String sport, String indoor, String author, String novel, String player,
			String hobiles) {
		super();
		UserId = userId;
		Sport = sport;
		Indoor = indoor;
		Author = author;
		Novel = novel;
		Player = player;
		this.hobiles = hobiles;
	}
	public UserHobies() {
		super();
		
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getSport() {
		return Sport;
	}
	public void setSport(String sport) {
		Sport = sport;
	}
	public String getIndoor() {
		return Indoor;
	}
	public void setIndoor(String indoor) {
		Indoor = indoor;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getNovel() {
		return Novel;
	}
	public void setNovel(String novel) {
		Novel = novel;
	}
	public String getPlayer() {
		return Player;
	}
	public void setPlayer(String player) {
		Player = player;
	}
	public String getHobiles() {
		return hobiles;
	}
	public void setHobiles(String hobiles) {
		this.hobiles = hobiles;
	}
	
	
 
	
	

}
