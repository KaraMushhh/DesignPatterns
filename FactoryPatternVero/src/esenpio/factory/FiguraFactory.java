package esenpio.factory;

public class FiguraFactory {
	public Figura getFigura(String figuraType) //scelta dell'utente della figura
	{
		if(figuraType==null) {
			return null;
		}
		if (figuraType.equalsIgnoreCase("CERCHIO"))
		{
			return new Cerchio();   //posso ritornare un oggetto di tipo Cerchio e non ti tipo Figura grazie al polimorfismo dato che abbiamo esteso figura
		}
		
		else if (figuraType.equalsIgnoreCase("RETTANGOLO"))
		{
			return new Rettangolo();
		}
		
		else if (figuraType.equalsIgnoreCase("QUADRATO"))
		{
			return new Quadrato();
		}
		
		return null;
		
	}
}
