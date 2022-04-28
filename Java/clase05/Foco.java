package clase05;

public class Foco {
	
	public String color;

	public String marca;

	public String tama�o;

	public String funcion;
	
	public Foco(String col, String mar, String tam, String fun)
	{
		
		establecerColor(col);
		establecerMarca(mar);
		establecerTama�o(tam);
		establecerFuncion(fun);
				
	}
	
	public String obtenerColor()
	{
		return color;
	}
	
	public void establecerColor(String col)
	{
		color = col;
	}
	
	public String obtenerMarca()
	{
		return marca;
	}
	
	public void establecerMarca(String mar)
	{
		marca = mar;
	}
	
	public String obtenerTama�o()
	{
		return tama�o;
	}
	
	public void establecerTama�o(String tam)
	{
		tama�o = tam;
	}
	
	public String obtenerFuncion()
	{
		return funcion;
	}
	
	public void establecerFuncion(String fun)
	{
		funcion =fun;
	}
	
}