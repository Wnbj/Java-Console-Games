package homework.oop.lesson.two.task.two;

public class College {
	public static void main(String[] args) {
		
		Student ivan = new Student("Java", 21, "Ivan");
		Student peter = new Student();
		Student georgi = new Student("Java", 22, "Georgi");
		Student maria = new Student("Math", 20, "Maria");
		
		maria.receiveScholarship(3.9, 350);
		ivan.receiveScholarship(4.5, 600);
		peter.receiveScholarship(3.95, 400);
		
		maria.upYear();
		peter.upYear();
		
		StudentGroup java = new StudentGroup("Java");
		StudentGroup math = new StudentGroup("Math");
		StudentGroup arts = new StudentGroup("Arts");
		
		java.addStudent(ivan);
		java.addStudent(maria);
		arts.addStudent(ivan);
		arts.addStudent(ivan);
		arts.addStudent(peter);
		java.addStudent(georgi);
		math.addStudent(maria);
		
		System.out.println("The best student in " + java.getGroupSubject() + " is " + java.bestStudent());
		
		
		
	}
}
