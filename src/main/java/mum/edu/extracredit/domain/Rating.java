package mum.edu.extracredit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rating {
	@Id
	@GeneratedValue
	private int ratingID;
	private int ratingVal;
	private String comment;
	private String userName;  //user who wrote the comment 
	
	public Rating() {
		
	}

	public Rating(int ratingID, int ratingVal , String comment,String userName) {
		this.ratingID = ratingID;
		this.ratingVal = ratingVal;
		this.comment=comment;
		this.userName=userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public int getRatingID() {
		return ratingID;
	}

	public void setRatingID(int ratingID) {
		this.ratingID = ratingID;
	}

	public int getRatingVal() {
		return ratingVal;
	}

	public void setRatingVal(int ratingVal) {
		this.ratingVal = ratingVal;
	}

}
