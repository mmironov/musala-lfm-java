package com.musala.lfm;

public class Notepad implements Searchable {

	private Page[] pages;
	
	public Notepad(int numberOfPages) {
		
		pages = new Page[numberOfPages];
		
		for(int i=0; i < pages.length; ++i) {
			pages[i] = new Page();			
		}
	}
	
	@Override
	public int searchText(String text) {
		
		for(int i=0; i < pages.length; ++i) {
			Page page = pages[i];
			
			if (page.getContent().toLowerCase().contains(text.toLowerCase().trim())) {
				return i;
			}
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i < pages.length; ++i) {
			
			if (!pages[i].isEmpty()) {				
				builder.append("(");
				builder.append(i + 1);
				builder.append(")\n");
				builder.append(pages[i].toString());
				builder.append("\n\n");
			}
		}
		
		return builder.toString();
	}
	
	public void addTextTo(String text, int pageNumber) {
		
		if (pageNumber >= 1 && pageNumber <= pages.length) {
			String newContent = pages[pageNumber - 1].getContent() + text;
			pages[pageNumber - 1].setContent(newContent);
			
			System.out.println("Added new text");
		}
	}
}