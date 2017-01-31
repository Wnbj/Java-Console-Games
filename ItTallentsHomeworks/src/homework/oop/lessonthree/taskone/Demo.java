package homework.oop.lessonthree.taskone;

public class Demo {
	public static void main(String[] args) {
		
		Person[] persons = new Person[10];
		
		persons[0] = new Person("Gosho", 19, true);
		persons[1] = new Person("Pesho", 20, true);
		
		persons[2] = new Employee("Nadka", 17, false, 60);
		persons[3] = new Employee("Cecka", 21, false, 50);
		
		persons[4] = new Student("Metodi", 19, true, 2.3);
		persons[5] = new Student("Maria", 19, false, 5.8);
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				break;
			}
			else if (persons[i] instanceof Employee) {
				((Employee)persons[i]).showEmployeeInfo();	
				System.out.println();
			}
			else if (persons[i] instanceof Student) {
				((Student)persons[i]).showStudentInfo();
				System.out.println();
				
			}
			else {
				persons[i].showPersonInfo();
				System.out.println();
			}				
		}
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				break;
			}
			else if (persons[i] instanceof Employee) {
				System.out.println(persons[i].getName() + " need to be paid " + ((Employee)persons[i]).calculateOvertime(2));
									
			}
		}	
	}
	
}
