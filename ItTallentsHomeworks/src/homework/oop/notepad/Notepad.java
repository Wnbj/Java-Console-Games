package homework.oop.notepad;

public interface Notepad {

	void addText(String text, int pageNumber);
	void replaceText(String text, int pageNumber);
	void removeText(int pageNumber);
	void rewiewNotepad();
	int searchWord(String word);
	void printAllPagesWithDigits();	
	
}
