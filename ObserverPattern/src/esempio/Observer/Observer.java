package esempio.Observer;

public abstract class Observer {
	
	protected Subject subject; //oggetto di tipo Subject
	
	public abstract void update(); //metodo astratto dell'update, la classe � astratta perch� contine almeno un metodo astratto
}
