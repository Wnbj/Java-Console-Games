package homework.oop.lesson.two.task.two;

public class StudentGroup {

	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	
	public StudentGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	public StudentGroup(String groupSubject){
		this();
		this.groupSubject = groupSubject;
	}
	
	public String getGroupSubject(){
		return this.groupSubject;
	}
	
	public void addStudent(Student student){	
		if (student.getSubject() != null) {
			if (this.freePlaces > 0 && student.getSubject().equals(this.groupSubject)) {
				for (int i = 0; i < students.length; i++) {
					if (students[i] == null) {
						students[i] = student;
						System.out.println(student.getName() + " has joined the groub " + this.groupSubject + ".");
						break;
					}
					this.freePlaces--;
				}		
			}
			else{
				if (student.getName() == null) {
					System.out.printf("This student cant join the group %s. The group is full or/and with different subject.%n",  
							this.groupSubject);
				}else{
					System.out.printf("%s cant join the group %s. The group is full or/and with different subject.%n", 
							student.getName(), 
							this.groupSubject);	
				}	
			}
		}
		else{
			System.out.println("The student has no subject.");
		}	
			
	}
	
	public void emptyGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	public String bestStudent(){
		int bestIdx = 0;
		double bestGrade = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}
			if (this.students[i].getGrade() > bestGrade) {
				bestGrade = students[i].getGrade();
				bestIdx = i;
			}
		}
		return students[bestIdx].getName();
	}
	
	public void printStudentsInGroup(){
		if (this.students.length < 1) {
			System.out.println("No students in this class.");
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}
			System.out.printf("Name: %s%nSubject: %s%nGrade: %f%nYearInCollege: %d%nAge: %d%nHave a degree: %b%nMoney: %f%n",
					students[i].getName(),
					students[i].getSubject(),
					students[i].getGrade(),
					students[i].getYearInCollage(),
					students[i].getAge(),
					students[i].getIsDegree(),
					students[i].getMoney());
		}
	}
	
}
