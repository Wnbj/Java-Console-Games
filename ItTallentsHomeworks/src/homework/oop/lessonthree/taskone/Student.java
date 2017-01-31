package homework.oop.lessonthree.taskone;

public class Student extends Person{
	
	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		}
	}
	
	public void showStudentInfo(){
		this.showPersonInfo();
		System.out.println("Score: " + this.score);		
	}
	
}
