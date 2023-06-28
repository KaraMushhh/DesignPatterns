package esempio.decorator;

public abstract class ShapeDecorator implements Shape {
	   
	protected Shape decoratedShape;

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape; //verrà settata come figura da decorare
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }	
	}