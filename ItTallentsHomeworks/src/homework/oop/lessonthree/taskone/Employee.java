package homework.oop.lessonthree.taskone;

public class Employee extends Person{
	
	public static final double WORK_HOURS = 8;
	private double daySalary;
	
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
		
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
	}
	
	public void showEmployeeInfo(){
		this.showPersonInfo();
		System.out.println("Day salary: " + daySalary);
	}	
	
	public double calculateOvertime(double hours){
		if (this.getAge() < 18) {
			return 0;
		}
		return (daySalary / WORK_HOURS) * 1.5;
	}

}
