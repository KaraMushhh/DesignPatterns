package esempio.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape); //nuova funzionalità
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
	}
