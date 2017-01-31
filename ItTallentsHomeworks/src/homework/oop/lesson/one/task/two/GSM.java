package homework.oop.lesson.one.task.two;

public class GSM {

	String model;
	boolean hasSimCard = false;
	String simMobileNumber;
	double outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	void insertSimCard(String newSimMobileNumber){
		if (!hasSimCard) {
			
			if (newSimMobileNumber.substring(0,2).equals("08") && newSimMobileNumber.length() == 10) {
				simMobileNumber = newSimMobileNumber;
				hasSimCard = true;
			}	
			else{
				System.out.println("Invalid SIM number");
			}
		}						
	}
	
	void removeSimCard(){
		hasSimCard = false;
		simMobileNumber = null;
	}
	
	void call(GSM receiver, double duration){
		
		if (duration > 0 && !this.simMobileNumber.equals(receiver.simMobileNumber) && receiver.hasSimCard && this.hasSimCard ) {
			 Call call = new Call();
			 call.receiver = receiver;
			 call.duration = duration;
			 call.caller = this;
			 
			 this.lastOutgoingCall = call;
			 receiver.lastIncomingCall = call;
			 this.outgoingCallsDuration += duration;
		}
		
	}
	
	double getSumForCall(){
		return this.outgoingCallsDuration * Call.priceForAMinute;
	}
	
	void printInfoForTheLastOutgoingCall(){
		if(lastOutgoingCall != null){
			System.out.printf("Last outgoing call is to %s%nDuration: %.2f", this.lastOutgoingCall.receiver.simMobileNumber, this.lastOutgoingCall.duration);
		}
		else {
			System.out.println("No calls info.");
		}
	}
	
	void printInfoForTheLastIncomingCall(){
		if (lastIncomingCall != null) {
			System.out.printf("Last incoming call is from %s%nDuration: %.2f", this.lastIncomingCall.receiver.simMobileNumber, this.lastIncomingCall.duration);
		}
		else{
			System.out.println("No calls info.");
		}
	}
	
}
