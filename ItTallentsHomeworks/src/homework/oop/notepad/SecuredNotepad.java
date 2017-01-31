package homework.oop.notepad;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {
	
	private String password;

	public SecuredNotepad(int numOfPages, String pass)throws Exception {
		super(numOfPages);
		if (!new PasswordValidator().validate(pass)) {
			throw new IllegalArgumentException("The password must contains at least one capitat and small letter, one digit and be at least 5 characters long.");
		}
		else {
			this.password = pass;
		}		
		
	}
	
	@Override
	public void addText(String text, int pageNumber) {
		if (matchPass()) {
			super.addText(text, pageNumber);
		}		
	}

	@Override
	public void replaceText(String text, int pageNumber) {
		if (matchPass()) {
			super.replaceText(text, pageNumber);
		}
	}

	@Override
	public void removeText(int pageNumber) {
		if (matchPass()){
			super.removeText(pageNumber);
			}	
	}

	@Override
	public void rewiewNotepad() {
		if (matchPass()) {
			super.rewiewNotepad();
		}
		
	}
	
	private boolean matchPass(){
		System.out.println("Please enter your password: ");
		String pass = IO.getInput();
		if (pass.equals(this.password)) {
			System.out.println("Password accepted.");
			return true;
		}
		System.out.println("Invalid password. Try again.");
		return matchPass();
	}
		
}
