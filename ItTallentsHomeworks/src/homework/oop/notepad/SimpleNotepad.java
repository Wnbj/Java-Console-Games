package homework.oop.notepad;

import java.util.Random;

public class SimpleNotepad implements Notepad{
	
	private Page[] pages;
	private int numOfPages;
	
	public SimpleNotepad(int numOfPages) {
		this.setNumOfPages(numOfPages);
		this.pages = new Page[numOfPages];
		this.putAllPages();
				
	}

	public void setNumOfPages(int numOfPages) {
		if (numOfPages > 0) {
			this.numOfPages = numOfPages;
		}	
	}
	
	private void putAllPages(){
		String[] titles = {"Notes", "Books", "Tasks", "Movies", "Music"};
		for (int i = 0; i < this.numOfPages; i++) {
			this.pages[i] = new Page(titles[new Random().nextInt(titles.length)], "");
		}
		
	}

	@Override
	public void addText(String text, int pageNumber) {
		if (isValidPage(pageNumber)) {
			this.pages[pageNumber-1].addText(text);
		}
		
	}

	@Override
	public void replaceText(String text, int pageNumber) {
		if (isValidPage(pageNumber)) {
			this.pages[pageNumber-1].eraseText();
			this.pages[pageNumber-1].addText(text);
		}
		
	}

	@Override
	public void removeText(int pageNumber) {
		if (isValidPage(pageNumber)){
			this.pages[pageNumber-1].eraseText();
			}
		
	}

	@Override
	public void rewiewNotepad() {
		for (int i = 0; i < this.pages.length; i++) {
			System.out.println(this.pages[i].lookAtPage());
			
		}	
	}
	
	@Override
	public int searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].searchWord(word) == 1){
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].containsDigits() == 1) {
				System.out.println(pages[i].lookAtPage());
			}
		}
		
	}
	
	protected boolean isValidPage(int pageNumber){
		return pageNumber > 0 && pageNumber < this.numOfPages;
	}
	
}
