package homework.oop.lesson.two.task.two;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	public Student(){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	public Student(String subject, int age, String name){
		this();
		this.subject = subject;
		this.age = age;
		this.name = name;
	}
	
	public String getSubject(){
		return this.subject;
	}
	public double getGrade(){
		return this.grade;
	}
	public String getName(){
		return this.name;
	}
	public int getYearInCollage(){
		return this.yearInCollege;
	}
	public int getAge(){
		return this.age;
	}
	public boolean getIsDegree(){
		return this.isDegree;
	}
	public double getMoney(){
		return this.money;
	}
	
	public void upYear(){
		if (isDegree) {
			System.out.println("This student already finish his education.");
		}
		else {
			yearInCollege++;
			if (yearInCollege == 4) {
				isDegree = true;
			}
		}
	}
	
	public double receiveScholarship(double min, double amount){
		if (this.grade > min && this.age < 30) {
			money += amount;
		}
		return money;
	}
	
	
	
	
	
}
