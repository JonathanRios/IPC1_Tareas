package problema1;
import java.util.*;
public class ControlSalarial {
	
	static int salarioBase, bonificaciones, horasLaborales, identificacion;
	static Scanner s=new Scanner(System.in);
	// estas variables sirven para guardar los datos de la empresa
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese horas trabajadas");
		horasLaborales = s.nextInt();
		System.out.println("Ingrese bonos trabajadas");
		bonificaciones = s.nextInt();
		System.out.println("Ingrese salario base");
		salarioBase = s.nextInt();
		System.out.println("Ingrese DPI");
		identificacion = s.nextInt();
		int salario;
		salario = depositar_HorasLaborales_Dpi (horasLaborales, bonificaciones, salarioBase);//llamando metodo 
		System.out.println("el salario es de: " + salario);
		System.out.println("su identificaion es: "+ identificacion);
	}

	// este metodo calcula el salario total, de igual manera para la clase Bonos
	public static int depositar_HorasLaborales_Dpi(int horasLaborales2, int bonificaciones2,
			int salarioBase2) {
		int c;
		c = (salarioBase2 + (horasLaborales2*bonificaciones2));
		return c;
	}	
}