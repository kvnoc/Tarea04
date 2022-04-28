package clase05;

public class Casa {
	
	public String tipo; 

	public String color;

	public String capacidad;
	
	public String funcion;
	
	public Casa(String tip, String col, String cap, String fun)
	{
		
		establecerTipo(tip);
		establecerColor(col);
		establecerCapacidad(cap);
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
	
	public String obtenerCapacidad()
	{
		return capacidad;
	}
	
	public void establecerCapacidad(String cap)
	{
		capacidad = cap;
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
