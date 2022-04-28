package clase05;

public class Estudiante {
	
	public String nombre;

	public String edad;

	public String genero;

	public String funcion;
	
	public Estudiante(String nom, String ed, String gen, String fun)
	{
		
		establecerNombre(nom);
		establecerEdad(ed);
		establecerGenero(gen);
		establecerFuncion(fun);
				
	}
	
	public String obtenerNombre()
	{
		return nombre;
	}
	
	public void establecerNombre(String nom)
	{
		nombre = nom;
	}
	
	public String obtenerEdad()
	{
		return edad;
	}
	
	public void establecerEdad(String ed)
	{
		edad = ed;
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