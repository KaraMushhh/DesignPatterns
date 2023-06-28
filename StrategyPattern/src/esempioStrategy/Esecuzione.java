package esempioStrategy;

public class Esecuzione {
	
	public static void main(String[] args) {
		
	      Context context = new Context(new OperationAdd());	//passo l'oggeto di tipo operation add 	
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationSottrazione());	//passo l'oggetto di tipo operazione sott	
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperazioneMoltip());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5)); //cosi rendiamo dinamico il programma, in base a quello che succede.
	   }
	}
	

