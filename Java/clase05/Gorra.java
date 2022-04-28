package clase05;

public class Gorra {
	
	  String color;

	  String modelo;

	  String marca;

	public String funcion;
	
	public Gorra(String col, String mod, String mar, String fun)
	{
		
		establecerColor(col);
		establecerModelo(mod);
		establecerMarca(mar);
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
	
	public String obtenerModelo()
	{
		return modelo;
	}
	
	public void establecerModelo(String mod)
	{
		modelo = mod;
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