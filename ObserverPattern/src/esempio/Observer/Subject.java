package esempio.Observer;
import java.util.ArrayList;
import java.util.List;

	public class Subject {
		
	   private List<Observer> observers = new ArrayList<Observer>(); //lista oggetti di tipo Observer
	   private int state; //stato

	   public int getState() {
	      return state;
	   }

	   public void setState(int state) {
	      this.state = state;
	      notifyAllObservers(); //se cambio lo stato manda un messaggio a tutti gli osservatori
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		 //prende un oggetto di tipo observer e lo aggiunge alla lista
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) { //ogni oggetto observer verrà aggiornati, vanno a stampare in valore esadecimale il valore che abbiamo dato
	         observer.update();
	      }
	   } 	
	}

