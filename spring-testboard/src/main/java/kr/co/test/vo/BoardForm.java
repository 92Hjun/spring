package kr.co.test.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class BoardForm {
	
	@NotNull
	@NotBlank
	private String title;
	@NotNull
	@NotBlank
	private String contents;

	private String category;
	
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContents() {
		return contents;
	}



	public void setContents(String contents) {
		this.contents = contents;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "BoardForm [title=" + title + ", content=" + contents + ", category=" + category + "]";
	}
	
	
	
}
