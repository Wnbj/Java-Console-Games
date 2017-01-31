package homework.oop.lessonthree.taskone;

public class Person {

	private String name;
	private int age;
	private boolean isMale;
	
	public Person(String name, int age, boolean isMale){
		this.setName(name);
		this.setAge(age);
		this.setMale(isMale);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}	
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public void showPersonInfo(){
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s%nAge: %d%nisMale: %b ", this.name, this.age, this.isMale);
	}
	
}
