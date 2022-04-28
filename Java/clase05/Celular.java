package clase05;

public class Celular {
	
	public String tamaño= "Pequenio";

	public String color = "Negro";

	public String marca= "Samsung";
	
	public String funcion;
	
	public Celular(String tam, String col, String mar, String fun)
	{
		
		establecerTamaño(tam);
		establecerColor(col);
		establecerMarca(mar);
		establecerFuncion(fun);
				
	}
	
	public String obtenerTamaño()
	{
		return tamaño;
	}
	
	public void establecerTamaño(String tam)
	{
		tamaño = tam;
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
