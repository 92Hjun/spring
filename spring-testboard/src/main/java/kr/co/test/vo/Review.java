package kr.co.test.vo;

import java.util.Date;

public class Review {
	
	private int reviewNo;
	private int reviewGroupNo;
	private String reviewContent;
	private String reviewWriter;
	private Date reviewRegdate;
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public int getReviewGroupNo() {
		return reviewGroupNo;
	}
	public void setReviewGroupNo(int reviewGroupNo) {
		this.reviewGroupNo = reviewGroupNo;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public String getReviewWriter() {
		return reviewWriter;
	}
	public void setReviewWriter(String reviewWriter) {
		this.reviewWriter = reviewWriter;
	}
	public Date getReviewRegdate() {
		return reviewRegdate;
	}
	public void setReviewRegdate(Date reviewRegdate) {
		this.reviewRegdate = reviewRegdate;
	}
	
}
