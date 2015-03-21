import java.util.Random;
import java.util.Scanner;
public class MenuFinal{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nivel1,nivel2;
		String nivel;
		boolean bandera=true;

		System.out.println("Binvenido a PRACTICA 1 IPC1 2015");
		System.out.println(" ");
		System.out.println("Seleccione el nivel que deseea ver:");
		while(true){
			System.out.println("Presione N1 y luego 1 para Nivel 1");
			System.out.println("Presione N2 y luego 2 para Nivel 2");
			System.out.println("Presione 3 para Salir ");
			nivel =s.nextLine();
			nivel =s.nextLine();

			switch(nivel){
			case "1":
				bandera =true;
				while(bandera ==true){
					System.out.println("Seleccione el sub índice (del 1 al 6) del ejercicio que deseea ejecutar:");
					System.out.println("1. Ejercicio 1");
					System.out.println("2. Ejercicio 2");
					System.out.println("3. Ejercicio 3");
					System.out.println("4. Ejercicio 4");
					System.out.println("5. Ejercicio 5");
					System.out.println("6. Salir al menu principal");
					nivel1 = s.nextInt();
					switch(nivel1){
					case 1:
						int i;
						int j;
						int k;
						int z;
						int cn=6;
						System.out.println("Piramide de *");
						System.out.println(" ");
						

						for (i=1; i<cn; i++){
							for (j=(5-i); j>0; j--)
							{
								System.out.print(" "); 
							}
							for (k=1; k<(2*i); k++)
							{
								System.out.print("*");
							}
							System.out.println(" ");
							
						}
						
						for (i= 4; i>0; i--){
							for (j=(i); j<5; j++)
							{
								System.out.print(" ");
							}
							for (k=3; k>=(5-i); k--)
							{
								System.out.print("*");	
							}
							
							for (z=(5-i); z<=4; z++)
							{
								System.out.print("*");	
							}
							
							System.out.println(" ");

						}
						System.out.println();

						break;
					case 2:

						int sum, num, num1,num2,num3,num4,num5,num6;
						System.out.println("Bienvenido a promedio de notas");
						System.out.println("Ingrese notas de 0 a 100");
						System.out.println(" ");
						System.out.println("Ingrese sus 6 notas");


						num1 = s.nextInt();
						num2 = s.nextInt();
						num3 = s.nextInt();
						num4 = s.nextInt();
						num5 = s.nextInt();
						num6 = s.nextInt();

						sum = (num1+num2+num3+num4+num5+num6);
						num = (sum/6);

						if (num >0 && num<=60) System.out.println("El estudiante saco una E");
						else if (num >60 && num<=69) System.out.println("El estudiante saco una D");
						else if (num >69 && num<=79) System.out.println("El estudiante saco una C");
						else if (num >79 && num<=89) System.out.println("El estudiante saco una B");
						else if (num >89 && num<=100) System.out.println("El estudiante saco una A");
						System.out.println();

						break;
					case 3:
						
						int hor, min;
						System.out.println("Bienvenido al convertidor de horas!");
						System.out.println(" ");
						System.out.println("Ingrese hora");
						hor = s.nextInt(); 
						System.out.println("Ingrese minutos");
						min = s.nextInt();

					
						if (hor>0 && hor<10 && min>=0 && min<=9) System.out.println("La hora es "+"0"+hor+":"+"0"+min+" am");
						else if (hor>0 && hor<10 && min>=10 && min<60) System.out.println("La hora es "+"0"+hor+":"+min+" am");
						else if (hor>0 && hor<9 && min==60) System.out.println("La hora es "+"0"+(hor+1)+":"+"00"+" am");
						else if (hor==9 && min==60) System.out.println("La hora es "+(hor+1)+":"+"00"+" am");
						
						else if (hor>9 && hor<12 && min>=0 && min<10) System.out.println("La hora es "+hor+":"+"0"+min+" am");
						else if (hor>9 && hor<12 && min>=10 && min<60) System.out.println("La hora es "+hor+":"+min+" am");
						else if (hor>9 && hor<11 && min==60) System.out.println("La hora es "+(hor+1)+":"+"00"+" am");
						else if (hor==11 && min>=0 && min<10) System.out.println("La hora es "+hor+":"+"0"+min+" am");
						else if (hor==11 && min>=10 && min<60) System.out.println("La hora es "+hor+":"+min+" am");
						else if (hor==11 && min==60) System.out.println("La hora es "+(hor+1)+":"+"00"+" pm");

						else if (hor==0 && min>=0 && min<10) System.out.println("La hora es "+(hor+12)+":"+"0"+min+" am");
						else if (hor==0 && min>=10 && min<60) System.out.println("La hora es "+(hor+12)+":"+min+" am");
						else if (hor==0 && min==60) System.out.println("La hora es "+"01"+":"+"00"+" am");
						
						else if (hor==12 && min>=0 && min<10) System.out.println("La hora es "+hor+":"+"0"+min+"pm");
						else if (hor==12 && min>=10 && min<60) System.out.println("La hora es "+hor+":"+min+"pm");
						else if (hor==12 && min==60) System.out.println("La hora es "+(hor+1)+":"+"00"+"pm");
						
						else if (hor>12 && hor<24 && min>=0 && min<=10) System.out.println("La hora es "+(hor-12)+":"+"0"+min+" pm");
						else if (hor>12 && hor<24 && min>=10 && min<60) System.out.println("La hora es "+(hor-12)+":"+min+" pm");
						else if (hor>12 && hor<23 && min>=10 && min==60) System.out.println("La hora es "+((hor-12)+1)+":"+"00"+" pm");
						
						else if (hor==23 &&  min>=0 && min<10) System.out.println("La hora es "+(hor-12)+":"+"0"+min+"pm");
						else if (hor==23 &&  min>=10 && min<60) System.out.println("La hora es "+(hor-12)+":"+min+"pm");
						else if (hor==23 &&  min==60) System.out.println("La hora es "+((hor-12)+1)+":"+"00"+"am");
						
						if (hor == 24 && min>=0 && min<10) System.out.println("La hora es "+(hor-12)+":"+"0"+min+" am");
						else if (hor == 24 && min>=10 && min<60) System.out.println("La hora es "+(hor-12)+":"+min+" am");
						else if (hor == 24 && min==60) System.out.println("La hora es "+(25-hor)+":"+"00"+" am");
						
						if (hor>24 || min>60 ){
							
							System.out.println("ERROR, la hora o los minutos son invalidos");
						}
						System.out.println();

						break;
					case 4:
						System.out.println("Bienbenido a ALTURAS, AREAS, PERIMETROS y RADIOS, donde:");
						System.out.println("C --> area, perimetro y radio de un circulo");
						System.out.println("U --> area y perimetro de un cuadrado");
						System.out.println("T --> area, perimetro y altura de un triangulo");
						
						Scanner caracteres = new Scanner(System.in);
						String x;
						double a,p,r,h,l;
						double pi = 3.14, aux = (Math.sqrt(3))/2;
						System.out.println("Seleccione los caracteres COMO SE VEN que señalizan lo que desea calcular");
				        x= caracteres.nextLine();
				        
				        double aux2;
						switch(x){
						case "C":
							System.out.println("Ingrese el radio del circulo");
							r = caracteres.nextDouble();
							a = pi*r;
							p = 2*pi*r;
							System.out.println("El radio es "+r);
							System.out.println("El area es "+a);
							System.out.println("El perimetro es "+p);
							System.out.println(" ");
							break;
						case "U":
							System.out.println("Ingrese un lado del cuadrado");
							l = caracteres.nextDouble();
							p= 4*l;
							a = l*=l;
							System.out.println("El area es "+a);
							System.out.println("El perimetro es "+p);
							System.out.println(" ");
							break;
						case "T":
							System.out.println("Ingrese un lado del triangulo");
							l = caracteres.nextDouble();
							p = 3*l;
							h = aux*l;
							a = (0.5)*l*h;
							System.out.println("El perimetro es "+p);
							System.out.println("La altura es "+h);
							System.out.println("El area es "+a);
							System.out.println(" ");
							break;
				        }
						System.out.println();
						
						break;
					case 5:
						int d1,m1,a1, d2,m2,a2,dif;
						 
						 System.out.println ("Bienvenido a diferencias de fechas");
						 System.out.println ("A continuacion debera ingresar 2 fechas en el orden en que se le pida");
						 System.out.println ("suponiendo que cada mes tiene 30 dias");
						 System.out.println("Las fechas se ingresan de forma numerica y los años de forma completa.");
						 System.out.println (" ");
						 
						 System.out.println ("Ingrese la primera fecha:");
						 System.out.print("día: ");
						 d1 = s.nextInt();
						 System.out.print("mes: ");
						 m1 = s.nextInt();
						 System.out.print("año: ");
						 a1 = s.nextInt();
						 System.out.println (" ");
						 
						 System.out.println ("Ingrese la segunda fecha:");
						 System.out.print("día: ");
						 d2 = s.nextInt();
						 System.out.print("mes: ");
						 m2 = s.nextInt();
						 System.out.print("año: ");
						 a2 = s.nextInt();
						 
						 (dif) = d2-d1 + 30*(m2-m1)+360*(a2-a1);
						 System.out.println ("Los dias de diferencia que hay son "+Math.abs(dif));
						 System.out.println();
						break;
					case 6:{
						bandera = false;
						break;
					}
					}
				}
				break;
			case "2":
				bandera =true;
				while(bandera == true){
					System.out.println("Seleccione el sub índice (del 6 al 16) del ejercicio que deseea ejecutar:");
					System.out.println("6. Ejercicio 6");
					System.out.println("7. Ejercicio 7");
					System.out.println("8. Ejercicio 8");
					System.out.println("9. Ejercicio 9");
					System.out.println("10. Ejercicio 10");
					System.out.println("11. Ejercicio 11");
					System.out.println("12. Ejercicio 12");
					System.out.println("13. Ejercicio 13");
					System.out.println("14. Ejercicio 14");
					System.out.println("15. Ejercicio 15");
					System.out.println("16. Salir al menu Principal");
					nivel2 =s.nextInt();
					switch(nivel2){
					case 6:
						System.out.println("Bienvenido a su calculadora simple");
						System.out.println(" ");
						System.out.println("Intrucciones:");
						System.out.println(" ");
						System.out.println("si desea sumar debera ingresar el caracter --> s");
						System.out.println("si desea restar debera ingresar el caracter --> r");
						System.out.println("si desea multiplicar debera ingresar el caracter --> m");
						System.out.println("si desea dividir debera ingresar el caracter --> d");
						System.out.println(" ");
						Scanner calculadora = new Scanner(System.in);
						String xx;
						float num1, num2,n,r,m,d;
						System.out.println("Ingrese la operacion deseada");
				        xx= calculadora.nextLine();
				        
				        switch(xx){
						case "s":
							System.out.println("Ingrese 2 numeros");
							num1 = calculadora.nextFloat();
							num2 = calculadora.nextFloat();
							n = num1+num2;
							System.out.println("La suma es "+n);
							System.out.println(" ");
							break;
						case "r":
							System.out.println("Ingrese 2 numeros");
							num1 = calculadora.nextFloat();
							num2 = calculadora.nextFloat();
							n = num1-num2;
							System.out.println("La resta es "+n);
							System.out.println(" ");
							break;
						case "m":
							System.out.println("Ingrese 2 numeros");
							num1 = calculadora.nextFloat();
							num2 = calculadora.nextFloat();
							m = num1*num2;
							System.out.println("La multiplicacion es "+m);
							System.out.println(" ");
							break;
						case "d":
							System.out.println("Ingrese 2 numeros");
							num1 = calculadora.nextFloat();
							num2 = calculadora.nextFloat();
							d = num1/num2;
							System.out.println("La divicion es "+d);
							System.out.println(" ");
							break;
				        }
				        System.out.println(" ");

						break;
					case 7:
						int a,b,c,dd,e,f,g,h,i,j,k,num;
						System.out.println("Ingrese un numero ENTERO entre 0 y 10");
						
						num = s.nextInt();
						
						 switch(num){
						 case 0:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;	
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								
								break;
							case 1:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								
								break;
							case 2:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
							case 3:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
							case 4:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
							case 5:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
							case 6:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
							case 7:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
							case 8:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
							case 9:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
							case 10:
								b=num*10;
								System.out.println(num+" por 10 es "+b);
								c=num*9;
								System.out.println(num+" por 9 es "+c);
								d=num*8;
								System.out.println(num+" por 8 es "+d);
								e=num*7;
								System.out.println(num+" por 7 es "+e);
								f=num*6;
								System.out.println(num+" por 6 es "+f);
								g=num*5;
								System.out.println(num+" por 5 es "+g);
								h=num*4;
								System.out.println(num+" por 4 es "+h);
								i=num*3;
								System.out.println(num+" por 3 es "+i);
								j=num*2;
								System.out.println(num+" por 2 es "+j);
								k=num*1;
								System.out.println(num+" por 1 es "+k);
								System.out.println(" ");
								break;
											
					        }


						
						break;
					case 8:
						int numinf,numsup,aa;


						System.out.println("Ingrese un numero entre 0 y 100 como limite inf y otro como numero superior");
						
						numinf = s.nextInt();
						numsup = s.nextInt();

						Random xxx = new Random();
						xxx.nextDouble();

						aa = (int) (xxx.nextDouble()*(numsup-numinf)+numinf);
						System.out.println("el numero aleatorio es "+aa);
						System.out.println(" ");

						int nn, dec;

						dec = aa / 10;
						nn = aa % 10;

						if (aa==10)
							switch(dec){
							case 1:
								System.out.print("se escribe diez");
								break;
							}


						if (aa==11)
							switch(dec){
							case 1:
								System.out.print("se escribe once");
								break;
							}
						if (aa==12)
							switch(dec){
							case 1:
								System.out.print("se escribe doce");
								break;
							}
						if (aa==13)
							switch(dec){
							case 1:
								System.out.print("se escribe trece");
								break;
							}
						if (aa==14)
							switch(dec){
							case 1:
								System.out.print("se escribe catorce");
								break;
							}
						if (aa==15)
							switch(dec){
							case 1:
								System.out.print("se escribe quince");
								break;

							}	 	

						if (aa>10 && aa!=11 && aa!=12 && aa!=13 && aa!=14 && aa!=15){

							switch(dec){
							case 0:
								System.out.print("");
								break;
							case 1:
								System.out.print("se escribe diez");
								break;
							case 2:
								System.out.print("se escribe veinte");
								break;
							case 3:
								System.out.print("se escribe treinta");
								break;
							case 4:
								System.out.print("se escribe cuarenta");
								break;
							case 5:
								System.out.print("se escribe cincuenta");
								break;
							case 6:
								System.out.print("se escribe sesenta");
								break;
							case 7:
								System.out.print("se escribe setenta");
								break;
							case 8:
								System.out.print("se escribe ochenta");
								break;
							case 9:
								System.out.print("se escribe noventa");
								break;
							}
							System.out.print(" y ");
							switch(nn){
							case 0:
								System.out.println("");
								break;
							case 1:
								System.out.println("uno");
								break;
							case 2:
								System.out.println("dos");
								break;
							case 3:
								System.out.println("tres");
								break;
							case 4:
								System.out.println("cuatro");
								break;
							case 5:
								System.out.println("cinco");
								break;
							case 6:
								System.out.println("seis");
								break;
							case 7:
								System.out.println("siete");
								break;
							case 8:
								System.out.println("ocho");
								break;
							case 9:
								System.out.println("nueva");
								break;
							}
						}

						if (aa<10){
							switch(nn){
							case 0:
								System.out.println("");
								break;
							case 1:
								System.out.println("se escribe uno");
								break;
							case 2:
								System.out.println("se escribe dos");
								break;
							case 3:
								System.out.println("se escribe tres");
								break;
							case 4:
								System.out.println("se escribe cuatro");
								break;
							case 5:
								System.out.println("se escribe cinco");
								break;
							case 6:
								System.out.println("se escribe seis");
								break;
							case 7:
								System.out.println("se escribe siete");
								break;
							case 8:
								System.out.println("se escribe ocho");
								break;
							case 9:
								System.out.println("se escribe nueva");
								break;
							}

						}
						System.out.println(" ");
						break;
					case 9:
						break;
					case 10:
						
						int numm,ii,jj,kk,pr=1;
						System.out.println("Bienvenido a su pirámide numérica ");
						System.out.println("al ingrese un numero le dara el tamaño a la piramide");
						System.out.println("ingrese tamaño de piramide:");
						
						num=s.nextInt();
						
						for(i=num;i>0;i--){
							for( j=i;j<num;j++){
								System.out.print(" ");
							}
							for( k=i;k>0;k--){
								System.out.print(pr+" ");
							}
							System.out.println(" ");
							pr +=1;
						}
						System.out.println(" ");

						break;
					case 11:
						break;
					case 12:
						break;
					case 13:
						break;
					case 14:

						float nummm,con1,con2;
						System.out.println("Bienvenido a su cuadrado personalizado!");
						System.out.println("Ingrese un lado del cuadrado");
						
						nummm = s.nextFloat();

						for(con1=0;con1<nummm;con1++){
							for(con2=0;con2<nummm;con2++){
								System.out.print("* ");
							}
							System.out.println(" ");
						}
						System.out.println(" ");
						break;
					case 15:
						int nom,iii,primo,abc=0;
						boolean aux;
						System.out.println("Bienvenido a su analizador de numeros primos!");
						System.out.println("Ingrese numero a analizar entre 1 y 100");
						
						nom = s.nextInt();

						for(iii=nom; iii>1; iii--){
							aux=true;
							primo =2;
							while(primo <= (iii-1) && aux == true){
								if(iii%primo==0){
									aux=false;
								}
								primo++;
							}
							if(aux==true){
								abc++;
							}
						}
						System.out.println("la cantidad de numeros primos que hay es de "+abc);
						System.out.println(" ");

						break;
					case 16:
						bandera =false;
						break;
					}
				}
				break;
			case "3":
				System.exit(0);
			}
		}
	}	
}