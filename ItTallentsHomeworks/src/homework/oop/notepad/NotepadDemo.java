package homework.oop.notepad;

public class NotepadDemo {
	public static void main(String[] args) throws Exception {
		
		Page page = new Page("Sup nigga?", "Not much.");
		page.addText("yo homie!");	
		System.out.println(page.lookAtPage());
		page.eraseText();
		System.out.println(page.lookAtPage());
		/*SimpleNotepad  simpleNotepad = new SimpleNotepad(10);
		simpleNotepad.addText("optimus prime", 3);
		simpleNotepad.rewiewNotepad();
		ISecuredNotepad securedNotepad = new SecuredNotepad(5, "Ma1ucka");
		SecuredNotepad securedNotepad2 = new SecuredNotepad(5, "Ma1ucka");
		securedNotepad2.rewiewNotepad();*/
		ElectronicSecuredNotepad esn = new ElectronicSecuredNotepad(10, "Ma1ucka");
		esn.rewiewNotepad();
		esn.start();
		esn.rewiewNotepad();
		Notepad[] pads = new Notepad[10];
		pads[0] = new SimpleNotepad(10);
		pads[1] = new SecuredNotepad(5, "Ma1ucka");
		pads[2] = new ElectronicSecuredNotepad(5, "Ma1ucka");
		
	}
	
}
