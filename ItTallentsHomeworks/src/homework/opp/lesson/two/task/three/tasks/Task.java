package homework.opp.lesson.two.task.three.tasks;

public abstract class Task {

	private String name;
	private int workingHours;
	
	public Task(String name, int workingHours){
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

	public int getWorkingHours(){
		return this.workingHours;
	}
	
	public void setWorkingHours(int workingHours){
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
		else {
			this.workingHours = 0;
		}
	}
	
}
