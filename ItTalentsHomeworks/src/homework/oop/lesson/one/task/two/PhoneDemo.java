package homework.oop.lesson.one.task.two;

public class PhoneDemo {
	public static void main(String[] args) {
		
		GSM nokia = new GSM();
		GSM blackberry = new GSM();
		
		nokia.model = "3310";
		blackberry.model = "Classic";
		nokia.insertSimCard("0888819255");
		blackberry.insertSimCard("0887265599");
		nokia.call(blackberry, 0.5);
		blackberry.call(nokia, 5.3);
		
		nokia.printInfoForTheLastIncomingCall();
		System.out.println();
		nokia.printInfoForTheLastOutgoingCall();
		System.out.println();
		blackberry.printInfoForTheLastIncomingCall();
		System.out.println();
		blackberry.printInfoForTheLastOutgoingCall();
		
		nokia.getSumForCall();
	}
}
