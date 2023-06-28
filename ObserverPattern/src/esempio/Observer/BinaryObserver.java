package esempio.Observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject){ //costruttore dove creo un oggetto di tipo subject che ereditiamo
	      this.subject = subject;
	      this.subject.attach(this); //usiamo this.subject.attach perchè così creiamo un nuovo osservatore che va aggiunto alla lista
	   }

	   @Override
	   public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); //trasforma in binario
	   }

}
