package clase05;

public class Cocina {
	
	public String marca;

	public String color;

	public String tipo;

	public String funcion;
	
	public Cocina(String tip, String col, String mar, String fun)
	{
		
		establecerTipo(tip);
		establecerColor(col);
		establecerMarca(mar);
		establecerFuncion(fun);
				
	}
	
	public String obtenerTipo()
	{
		return tipo;
	}
	
	public void establecerTipo(String tip)
	{
		tipo = tip;
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