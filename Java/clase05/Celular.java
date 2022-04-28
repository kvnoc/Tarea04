package clase05;

public class Celular {
	
	public String tama�o= "Pequenio";

	public String color = "Negro";

	public String marca= "Samsung";
	
	public String funcion;
	
	public Celular(String tam, String col, String mar, String fun)
	{
		
		establecerTama�o(tam);
		establecerColor(col);
		establecerMarca(mar);
		establecerFuncion(fun);
				
	}
	
	public String obtenerTama�o()
	{
		return tama�o;
	}
	
	public void establecerTama�o(String tam)
	{
		tama�o = tam;
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
	
	public String obtenerFuncion()
	{
		return funcion;
	}
	
	public void establecerFuncion(String fun)
	{
		funcion =fun;
	}
	
}
