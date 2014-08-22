//clase principal
public class animal 
{

	//declaracion de variables en la clase principal
	String nombre;
	int edad;
	
	public animal(String nombre, int edad) {
	}
	
	//obteniendo valores para las variables
		String getNombre()
		{
		return nombre;	
		}
		int getEdad()
		{
		return edad;
		}
	
	//creando las funciones y asignando valores a las variables ya creadas
		void setNombre (String nombre)
		{
			this.nombre = nombre;
		}
		
		void setEdad (int edad)
		{
			this.edad = edad;
		}
}
