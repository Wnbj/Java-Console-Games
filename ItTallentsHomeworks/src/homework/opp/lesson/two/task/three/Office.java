package homework.opp.lesson.two.task.three;

import java.util.Random;

import homework.opp.lesson.two.task.three.tasks.MakeChocolate;
import homework.opp.lesson.two.task.three.tasks.PutInBoxes;
import homework.opp.lesson.two.task.three.tasks.WrapingInFoil;

public class Office {
	public static void main(String[] args) {
		
		AllWork workInChocolateFactory = new AllWork();
		for (int i = 0; i < AllWork.ALL_TASK_SIZE; i++) {
			if (i < 4) {
				workInChocolateFactory.addTask(new MakeChocolate("Make Chokolate", new Random().nextInt(222) + 4));
			}
			else if (i > 3 && i < 8) {
				workInChocolateFactory.addTask(new WrapingInFoil("Wraping in foil", new Random().nextInt(122) + 4));
			}
			else {
				workInChocolateFactory.addTask(new PutInBoxes("Put in boxes", new Random().nextInt(122) + 4));
			}
		}
		
		Employee.setAllWork(workInChocolateFactory);
		
		Employee[] workers = new Employee[4];
		workers[0] = new Employee("Gosho");
		workers[1] = new Employee("Pesho");
		workers[2] = new Employee("Ivan");
		workers[3] = new Employee("Misho");
		int daysCounter = 1;
		
		while(true){
			System.out.println("Day " + daysCounter);
			System.out.println("_____________");
			for (int i = 0; i < workers.length; i++) {
				workers[i].work();				
				
			}
			daysCounter++;
			
			if (Employee.getAllWork().isAllWorkDone()) {
				boolean isAllDone = true;
				for (int i = 0; i < workers.length; i++) {
					if (!workers[i].isDone()) {
						isAllDone = false;
					}
				}
				if (isAllDone) {
					System.out.println("The all tasks are done in " + daysCounter + " days.");
					break;
				}
									
			}
			
		}	
		
	}
}
