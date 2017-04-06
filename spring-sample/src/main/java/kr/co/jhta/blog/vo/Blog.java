package kr.co.jhta.blog.vo;

import java.util.Date;

public class Blog {
	private int no;
	private int category;
	private String writer;
	private String title;
	private String content;
	private String upFile;
	private String hashtag;
	private Date regdate;
	
	public Blog(){}
	
	public Blog(int no, int category, String writer, String title, String content, String upFile, String hashtag,
			Date regdate) {
		this.category = category;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.upFile = upFile;
		this.hashtag = hashtag;
		this.regdate = new Date();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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

	public String getUpFile() {
		return upFile;
	}

	public void setUpFile(String uploadFile) {
		this.upFile = uploadFile;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Blog [no=" + no + ", category=" + category + ", writer=" + writer + ", title=" + title + ", content="
				+ content + ", upFile=" + upFile + ", hashtag=" + hashtag + ", regdate=" + regdate + "]";
	}
	
	
}
