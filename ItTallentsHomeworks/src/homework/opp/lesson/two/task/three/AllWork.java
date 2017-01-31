package homework.opp.lesson.two.task.three;

import homework.opp.lesson.two.task.three.tasks.Task;

public class AllWork {
	
	public static final int ALL_TASK_SIZE = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTasks;
	
	public AllWork(){
		this.freePlacesForTasks = ALL_TASK_SIZE;
		this.tasks = new Task[ALL_TASK_SIZE];
		this.currentUnassignedTasks = -1;
		
	}
	
	public void addTask(Task task){
		
		if (freePlacesForTasks >= 0) {
			this.tasks[ALL_TASK_SIZE - freePlacesForTasks] = task;
			freePlacesForTasks--;
		}
		else {
			System.out.println("We cant take more tasks.");
		}
								
	}
	
	public Task getNextTask(){
		currentUnassignedTasks++;
		if (currentUnassignedTasks > 9) {
			return null;
		}		
		return tasks[currentUnassignedTasks];
		
	}
	
	public boolean isAllWorkDone(){
		return currentUnassignedTasks >= ALL_TASK_SIZE - freePlacesForTasks - 1;
	}

}
