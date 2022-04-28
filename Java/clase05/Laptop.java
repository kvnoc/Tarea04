package clase05;

public class Laptop {
	
	public String marca;

	public String modelo;

	public String color;

	public String funcion;
	
	public Laptop(String col, String mar, String mod, String fun)
	{
		
		establecerMarca(mar);
		establecerModelo(mod);
		establecerColor(col);
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
	
	public String obtenerModelo()
	{
		return modelo;
	}
	
	public void establecerModelo(String mod)
	{
		modelo = mod;
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