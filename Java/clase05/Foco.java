package clase05;

public class Foco {
	
	public String color;

	public String marca;

	public String tamaño;

	public String funcion;
	
	public Foco(String col, String mar, String tam, String fun)
	{
		
		establecerColor(col);
		establecerMarca(mar);
		establecerTamaño(tam);
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
	
	public String obtenerTamaño()
	{
		return tamaño;
	}
	
	public void establecerTamaño(String tam)
	{
		tamaño = tam;
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