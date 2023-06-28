package esempio.decorator;

public class DecoratorPatternDemo {
	   public static void main(String[] args) {

	      Shape circle = new Circle(); //component e concrete component

	      Shape redCircle = new RedShapeDecorator(new Circle()); //praticamente creo la nuovo classe dove ci saranno nuovi metodi per il cerchio
	      //creo un oggetto di tipo concrete componet e lo faccio avvolgere dal decoratore
	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
	}
