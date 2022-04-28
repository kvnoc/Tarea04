package clase05;

public class Lapicero {
	
	public String color;

	public String marca;

	public String tipo;

	public String funcion;
	
	public Lapicero(String col, String mar, String tip, String fun)
	{
		
		establecerColor(col);
		establecerMarca(mar);
		establecerTipo(tip);
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
	
	public String obtenerTipo()
	{
		return tipo;
	}
	
	public void establecerTipo(String tip)
	{
		tipo = tip;
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