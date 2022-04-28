package clase05;

public class Gato {
	
	public String color;

	public String raza;

	public String genero;

	public String funcion;
	
	public Gato(String col, String ra, String gen, String fun)
	{
		
		establecerColor(col);
		establecerRaza(ra);
		establecerGenero(gen);
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
	
	public String obtenerRaza()
	{
		return raza;
	}
	
	public void establecerRaza(String ra)
	{
		raza = ra;
	}
	
	public String obtenerGenero()
	{
		return genero;
	}
	
	public void establecerGenero(String gen)
	{
		genero = gen;
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