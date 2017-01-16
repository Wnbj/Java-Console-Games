package homework.opp.lesson.two.task.three;

public class Employee {

	private String name;
	private Task currentTask;
	private double hoursLeft;
	
	public Employee(String name){
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.equals("")) {
			this.name = name;
		}	
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0 && hoursLeft <= 24) {
			this.hoursLeft = hoursLeft;
		}
		else {
			this.hoursLeft = 0;
		}
	}
	
	public void work(){
		if (this.currentTask != null) {
			if (currentTask.getworkingHours() >= hoursLeft) {
				currentTask.setWorkingHours(currentTask.getworkingHours() - hoursLeft);
				setHoursLeft(0);
			}
			else {
				currentTask.setWorkingHours(0);
				setHoursLeft(hoursLeft - currentTask.getworkingHours());
			}
		}
		this.showReport();
	}
	
	private void showReport(){
		System.out.printf("Name: %s%nTask name: %s%nEmployee hours left: %.1f%nHours left on task: %.1f%n",
				name,
				currentTask.getName(),
				hoursLeft,
				currentTask.getworkingHours());
	}
	
	
}
