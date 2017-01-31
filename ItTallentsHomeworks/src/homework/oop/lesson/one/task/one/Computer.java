package homework.oop.lesson.one.task.one;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	public Computer(){
		
		this.isNotebook = false;
		this.operationSystem = "Windows XP";
	}
	
	public Computer(int year, double price, double hardDiskMemory, double freeMemory ){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	public Computer(int year, double price, boolean isNotebook, double hardDiskMemmory, double freeMemory, String operationSystem){
		this(year, price, hardDiskMemmory, freeMemory);	
		this.operationSystem = operationSystem;
		this.isNotebook = isNotebook;
	}
	
	int comparePrice(Computer comp){
		if (this.price > comp.price) {
			return -1;
		}
		else if(this.price < comp.price){
			return 1;
		}
		return 0;
	}
	
	void changeOperationSystem(String newOperationSystem){
		operationSystem = newOperationSystem;
	}
	
	void useMemory(int memory){
		if (freeMemory > memory) {
			freeMemory -= memory;
		}
		else {
			System.out.println("Not enough free memory!");
		}
	}
		
}
