package homework.opp.lesson.two.task.three;

public class Office {
	public static void main(String[] args) {
		
		Task work = new Task("Coding", 30);
		Employee krum = new Employee("Krum");
		krum.setCurrentTask(work);
		krum.setHoursLeft(8.5);
		krum.work();
		
	}
}
