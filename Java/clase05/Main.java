package clase05;

public class Main {

	public static void main(String[] args) {
		
		//Cambiar clase
		Libro libro = new Libro("Epico", "Azul", "La Odisea", "Leer");
		
		//Cambiar metodos(operaciones)
		System.out.println(libro.obtenerGenero());
		System.out.println(libro.obtenerColor());
		System.out.println(libro.obtenerTitulo());
		System.out.println(libro.obtenerFuncion());
	}

}
