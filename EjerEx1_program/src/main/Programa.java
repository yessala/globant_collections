/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yessa
 */
public class Programa {

	static List<Integer> list = new ArrayList();
	static Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		agregarNumero();
		System.out.println("La cantidad de valores ingresados es: "+list.size());
		System.out.println("La suma de todos los números es: "+ sumar());
		System.out.println("El promedio de los valores es: " + promedio());
			
	}
	
	public static void agregarNumero() {
		int num;
		do {
			System.out.print("Ingrese un número: ");
			num = scan.nextInt();
			if (num == -99) {
				break;
			}else {
				list.add(num);
			}			
		}while (num != -99);
	}
	
	public static int sumar() {
		int suma=0;
		
		for (Integer num : list) {
			suma += num;
		}		
		
		return suma;
	}
	
	public static Double promedio() {
		return (double) (sumar()/list.size());
	}

}
