package esempioStrategy;

public class Context {
	private Strategy strategy;


	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2)
	{
		return strategy.DoOperation(num1, num2);
	}
}
