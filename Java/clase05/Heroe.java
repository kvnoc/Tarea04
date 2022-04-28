package clase05;

public class Heroe {
	
	public String nombre;

	public String tipo;

	public String poder;

	public String funcion;
	
	public Heroe(String nom, String tip, String pod, String fun)
	{
		
		establecerNombre(nom);
		establecerTipo(tip);
		establecerPoder(pod);
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
	
	public String obtenerTipo()
	{
		return tipo;
	}
	
	public void establecerTipo(String tip)
	{
		tipo = tip;
	}
	
	public String obtenerPoder()
	{
		return poder;
	}
	
	public void establecerPoder(String pod)
	{
		poder = pod;
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