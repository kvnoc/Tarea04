package clase05;

public class Bicicleta {
	
	public String color;

	public String tipo;

	public String marca;
	
	public String funcion;
	
	public Bicicleta(String col, String tip, String mar, String fun)
	{
		
		establecerColor(col);
		establecerTipo(tip);
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
	
	public String obtenerTipo()
	{
		return tipo;
	}
	
	public void establecerTipo(String tip)
	{
		tipo = tip;
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
