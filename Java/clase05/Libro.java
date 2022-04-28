package clase05;

public class Libro {
	
	public String genero;

	public String color;

	public String titulo;

	public String funcion;
	
	public Libro(String gen, String tit, String col, String fun)
	{
		
		establecerGenero(gen);
		establecerTitulo(tit);
		establecerColor(col);
		establecerFuncion(fun);
				
	}
	
	public String obtenerGenero()
	{
		return genero;
	}
	
	public void establecerGenero(String gen)
	{
		genero = gen;
	}
	
	public String obtenerTitulo()
	{
		return titulo;
	}
	
	public void establecerTitulo(String tit)
	{
		titulo = tit;
	}
	
	public String obtenerColor()
	{
		return color;
	}
	
	public void establecerColor(String col)
	{
		color = col;
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