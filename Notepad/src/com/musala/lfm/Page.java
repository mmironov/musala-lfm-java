package com.musala.lfm;

public class Page {

	private String title;
	private String content;
	
	public Page() {
		this("", "");
	}
	
	public Page(String title, String content) {
		
		title = (title != null) ? title : "";
		content = (content != null) ? content : "";
		
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		
		if (title != null) {
			this.title = title;			
		}
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		
		if (content != null) {			
			this.content = content;
		}
	}
	
	boolean isEmpty() {
		return title.equals("") && content.equals("");
	}
	
	@Override
	public String toString() {
		
		return title + "\n" + content;
	}
}
