package homework.opp.lesson.two.task.three;

import homework.opp.lesson.two.task.three.tasks.Task;

public class Employee {
	
	public static final int WORK_HOURS_PER_DAY = 8;

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;
	private boolean isDone;
	
	public Employee(String name){
		this.setName(name);
		startWorkingDay();
		setCurrentTask(allWork.getNextTask());
		setDone(false);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.equals(null) && !name.isEmpty()) {
			this.name = name;
		}	
	}
	
	public boolean isDone() {
		return isDone;
	}

	private void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	private void setCurrentTask(Task newTask) {
		if (newTask != null) {
			this.currentTask = newTask;
		}
	}

	public int getHoursLeft() {
		return this.hoursLeft;
	}
	
	public static void setAllWork(AllWork newAllWork){
		if(newAllWork != null){
			Employee.allWork = newAllWork;
		}
	}
	
	public static AllWork getAllWork(){
		return Employee.allWork;
	}

	private void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0 && hoursLeft <= 24) {
			this.hoursLeft = hoursLeft;
		}
		else {
			this.hoursLeft = 0;
		}
	}
	
	public void work(){
		startWorkingDay();
		if (this.currentTask != null) {
			
			System.out.println(this.name + " is working on task " + currentTask.getName());
			
			if (currentTask.getWorkingHours() > this.hoursLeft) {
				currentTask.setWorkingHours(currentTask.getWorkingHours() - this.hoursLeft);
				this.setHoursLeft(0);
				System.out.println("End of the working day. The employee will continue working ot this task tommorow.");
			}
			else {
				setHoursLeft(this.hoursLeft -= currentTask.getWorkingHours());
				currentTask.setWorkingHours(0);
				System.out.println(this.name + " finished task " + currentTask.getName());
				
			}
				
			if (hoursLeft > 0) {
				Task tempTask = allWork.getNextTask();
				if (tempTask == null) {
					System.out.println(this.getName() + " Finished his all task.");	
					this.setDone(true);
					System.out.println("-------------------");
				}
				else{
					this.currentTask = tempTask;
					this.work();
				}
				
				
			}			
				showReport();
				System.out.println("--------------------------");
				
		}
		
	}
	
	private void showReport(){
		System.out.printf("Name: %s%nTask name: %s%nEmployee hours left: %d%nHours left on task: %d%n",
				name,
				currentTask.getName(),
				hoursLeft,
				currentTask.getWorkingHours());
	}
	
	private void startWorkingDay(){
		this.setHoursLeft(WORK_HOURS_PER_DAY);
	}
	
}
