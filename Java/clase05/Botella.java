package clase05;

public class Botella {
	
	public String marca;

	public String material;

	public String capacidad;
	
	public String funcion;
	
	public Botella(String mar, String cap, String mat, String fun)
	{
		
		establecerMarca(mar);
		establecerCapacidad(cap);
		establecerMaterial(mat);
		establecerFuncion(fun);
				
	}
	
	public String obtenerMaterial()
	{
		return material;
	}
	
	public void establecerMaterial(String mat)
	{
		material = mat;
	}
	
	public String obtenerMarca()
	{
		return marca;
	}
	
	public void establecerMarca(String mar)
	{
		marca = mar;
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
