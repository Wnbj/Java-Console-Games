package homework.opp.lesson.two.task.three;

public class Task {

	private String name;
	private double workingHours;
	
	public Task(String name, double workingHours){
		this.setName(name);
		this.setWorkingHours(workingHours);
		
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if (!name.equals("")) {
			this.name = name;
		}
		
	}
	public double getworkingHours(){
		return this.workingHours;
	}
	public void setWorkingHours(double workingHours){
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
		else {
			this.workingHours = 0;
		}
	}
	
}
