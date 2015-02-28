import java.util.Scanner;

public class NumParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z;		
		System.out.println("Ingrese un numero");
		Scanner xy = new Scanner(System.in);
		z = xy.nextInt();
		//Comando IF
		if (z%2==0){
			System.out.println("El numero es par");
		}
		else
			System.out.println("El numero no es par");
	}		
}
