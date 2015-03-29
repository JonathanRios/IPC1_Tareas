package problema2;
import java.util.Scanner;
public class Zoologico {
	public static class Especies{
		static Scanner s = new Scanner(System.in);
		//las siguientes variables muestran un animal y su nombre cientifico, se tendran que tener los nombres de los demas animales como una base de datos
		static String nombreCastellano = "Leon, ";
		static String nombreCientifico = "Lionus Maximus";
		
		public static void main(String[] args) {
			String mostrar;
			mostrar = nombreAnimal (nombreCastellano, nombreCientifico);//llamando metodo que muesta los animales
			System.out.println("el animal es: "+ mostrar);
		}
		public static String nombreAnimal(String a,
				String b) {
			String c,d;
			c = a+b;
			return c;//rotornando al nombre
		}
	}
	public static class Empleados{
		 //una de las variables que mostrara los empleadosen general.
		static String datosGenerales = "nombre, fecha ingreseo, telefono, direccion";
		
		public static void main(String[] args) {
			String d;
			d = verEmpleado (datosGenerales); //llamando metodo para mostrar 
			System.out.println(d);
		}
		private static String verEmpleado(String a) {
			String c;
			c=a;
			return c; //retornando a los datos
		}
	}
	public static class Cuidadores{
		//de igual manera que la clase Empleados		
	}
	public static class Guias{
		//de igual manera que la clase Empleados
	}
	public static class Habitad{
		//de igual manera que la clase Especies, solo agregando informacion del habitad del animal y su extencion territorial.
	}
	public static class Zona{
		//de igual manera que la clase Especies, solo agregando informacion de la zona en que se encuentra el animal.
	}
	public static class Intinerario{
		//variables con las cuales se ingresa el intineracio
		static float codigo;
		static float maximaVisitantes;
		static double duracion;
		static double longitud;
		static int cantidadEspecies;
		
		public static void main(String[] args) {
			System.out.println("Ingrese Especie, etc. ");//asi para cada variable
			float most;
			most = verInt (codigo);//llamando uno de los metodos para mostrar los datos
			System.out.println("codigo de intinerario es: "+most);
		}
		public static float verInt(float cod) {
			float c;
			c=cod;
			return c;//regresando uno de los datos (codigo)
		}
	}
}
