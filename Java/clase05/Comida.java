package clase05;

public class Comida {
	
	public String color = "Variado";

	public String tipo= "Caliente";

	public String cantidad= "1/2 racion";

	public String funcion;
	
	public Comida(String tip, String col, String can, String fun)
	{
		
		establecerTipo(tip);
		establecerColor(col);
		establecerCantidad(can);
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
	
	public String obtenerCantidad()
	{
		return cantidad;
	}
	
	public void establecerCantidad(String can)
	{
		cantidad = can;
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