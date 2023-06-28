package esenpio.factory;

public class Esecuzione  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraFactory factory = new FiguraFactory();
		Figura figl = factory.getFigura("CERCHIO");
		figl.stampa();
		
		Figura fig2 = factory.getFigura("QUDTRATO");
		fig2.stampa();
		
		Figura fig3 = factory.getFigura("RETTANGOLO");
		fig3.stampa();
	}

}
