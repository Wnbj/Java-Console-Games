package homework.oop.notepad;

public class Page {

	private String title;
	private String text;
	
	public Page(String title, String text){
		this.setTitle(title);
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text != null) {
			this.text = text;
		}
		
	}

	public void setTitle(String title) {
		if (title != null && !title.isEmpty()) {
			this.title = title;
		}
	}
	
	public void addText(String textToAdd){
		if (textToAdd != null) {
			this.setText(this.text + " " + textToAdd);
		}
	}
	
	public void eraseText(){
		this.setText("");
	}
	
	public String lookAtPage(){
		return String.format("             %s%n%s%n", this.title, this.text);
	}
	
	public int searchWord(String word){
		if (this.text.contains(word)) {
			return 1;
		}
		return -1;
	}
	
	public int containsDigits(){
		if (text.matches("\\d")) {
			return 1;
		}
		return -1;
	}
	
}
