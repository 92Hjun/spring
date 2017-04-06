package kr.co.jhta.blog.vo;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

public class BlogForm {
	@NotNull
	private int category;
	@NotNull
	private String title;
	@NotNull
	private String content;
	private MultipartFile uploadFile;
	private String hashtag;
	private Date regdate;

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public MultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	@Override
	public String toString() {
		return "BlogForm [title=" + title + ", content=" + content + ", uploadFile=" + uploadFile + ", hashtag="
				+ hashtag + "]";
	}
	
	
	
	
}
