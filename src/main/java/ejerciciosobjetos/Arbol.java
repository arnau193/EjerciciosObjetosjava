package ejerciciosobjetos;

public class Arbol {

	int altura;
	String nombre;
	
	Arbol(int altura)
	{
		this.altura=altura;
		System.out.println("Un �rbol de "+altura+ " metros");
	}
	
	Arbol(String nombre)
	{
		this.nombre=nombre;
		System.out.println("Un "+ nombre);
	}
	Arbol()
	{
		System.out.println("Un �rbol gen�rico");
	}
	Arbol(int altura, String nombre)
	{
		this.altura=altura;
		this.nombre=nombre;
		System.out.println("Un " +nombre+ "de " +altura +" metros");
	}
}