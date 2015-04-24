import java.util.LinkedList;
public class Cola {
	LinkedList<Integer> cola = new LinkedList<Integer>();
	public void mostrarAdd (int b){
		System.out.println("Ingresando valor de "+b+" a la cola...");		
		cola.add(b);
	}
	public void mostrarRemove(){
		System.out.println("Removiendo objeto de la pila...");
		cola.remove();
	}
	public void mostrarCola(){
		System.out.println("Contenido de la pila: "+cola);
	}
	public static void main(String[]args){
		Cola c = new Cola();
		c.mostrarCola();
		c.mostrarAdd(100);
		c.mostrarCola();
		c.mostrarAdd(80);
		c.mostrarCola();
		c.mostrarAdd(60);
		c.mostrarCola();
		c.mostrarAdd(40);
		c.mostrarCola();
		c.mostrarAdd(20);
		c.mostrarCola();
		c.mostrarRemove();
		c.mostrarCola();
		c.mostrarRemove();
		c.mostrarCola();
		c.mostrarRemove();
		c.mostrarCola();
		c.mostrarRemove();
		c.mostrarCola();
		c.mostrarRemove();
		c.mostrarCola();
	}
}
