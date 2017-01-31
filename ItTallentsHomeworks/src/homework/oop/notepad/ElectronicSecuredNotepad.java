package homework.oop.notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IЕlectronicDevice {
	
	private boolean isStarted;

	public ElectronicSecuredNotepad(int numOfPages, String pass) throws Exception {
		super(numOfPages, pass);	
		this.isStarted = false;
	}

		@Override
		public void start() {
			isStarted = true;
			
		}
	
		@Override
		public void stop() {
			isStarted = false;
			
		}
	
		@Override
		public boolean isStarted() {
			return isStarted;
		}
	
		@Override
		public void addText(String text, int pageNumber) {
			if (isStarted) {
				super.addText(text, pageNumber);
			}
			
		}
	
		@Override
		public void replaceText(String text, int pageNumber) {
			if (isStarted) {
				super.replaceText(text, pageNumber);
			}
			
		}
	
		@Override
		public void removeText(int pageNumber) {
			if (isStarted){
				super.removeText(pageNumber);
				}
			
		}
	
		@Override
		public void rewiewNotepad() {
			if (isStarted) {
				super.rewiewNotepad();
			}
			else {
				System.out.println("Turn it on first.");
			}
	
	}
}