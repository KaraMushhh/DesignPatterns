package esempio.Observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		  Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject); //cosi ci sono tre osservatori per subject di tipo binary, hexa e octal observer 
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15); //setto lo stato a 15
	      System.out.println("Second state change: 10");	
	      subject.setState(10);	

	}

}
