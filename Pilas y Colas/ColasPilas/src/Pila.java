import java.util.*;
public class Pila{
	Stack pila = new Stack();
	public void mostrarPush(int a){
		System.out.println("Ingresando valor de "+a+" a la pila");
		pila.push(a);
	}
	public void mostrarPop(){
		System.out.println("Pop de la pila...");
		pila.pop();
	}
	public void mostrarPila(){
		System.out.println("Contenido de la pila "+pila);
	}
	public static void main (String [] arg){
		Pila p= new Pila();
		p.mostrarPila();
		p.mostrarPush(20);
		p.mostrarPila();
		p.mostrarPush(40);
		p.mostrarPila();
		p.mostrarPush(60);
		p.mostrarPila();
		p.mostrarPush(80);
		p.mostrarPila();
		p.mostrarPush(100);
		p.mostrarPila();
		p.mostrarPop();
		p.mostrarPila();
		p.mostrarPop();
		p.mostrarPila();
		p.mostrarPop();
		p.mostrarPila();
		p.mostrarPop();
		p.mostrarPila();
		p.mostrarPop();
		p.mostrarPila();	
	}
}