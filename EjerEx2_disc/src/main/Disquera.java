/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import main.entity.CantanteFamoso;

/**
 * @author yessa
 * 
 *         Se debe, además, en el main, crear una lista de tipo CantanteFamoso y
 *         agregar 5 objetos de tipo CantanteFamoso a la lista. Luego, se debe
 *         mostrar los nombres de cada cantante y su disco con más ventas por
 *         pantalla. 
 *         Una vez agregado los 5, en otro bucle, crear un menú que le
 *         de la opción al usuario de agregar un cantante más, mostrar todos los
 *         cantantes, eliminar un cantante que el usuario elija o de salir del
 *         programa. Al final se deberá mostrar la lista con todos los cambios
 * 
 */
public class Disquera {
	static Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	static List<CantanteFamoso> lista = new ArrayList();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CantanteFamoso c1 = new CantanteFamoso("Shakira", "Pies descalzos");
		CantanteFamoso c2 = new CantanteFamoso("Coldplay", "Science");
		CantanteFamoso c3 = new CantanteFamoso("Simple Plan", "Perfect");
		CantanteFamoso c4 = new CantanteFamoso("Good Charlotte", "The world is black");
		CantanteFamoso c5 = new CantanteFamoso("Elvis Presley", "My way");

		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		menu();
	}
	
	public static void menu() {
		int option;
		System.out.println("");
		do {
			System.out.print("Que desea realizar\n"
					+ "1. Agregar más cantante a la lista\n"
					+ "2. Mostrar lista\n"
					+ "3. Eliminar cantante de la lista\n"
					+ "4. Salir\nOpcion: ");
			option = scan.nextInt();
			switch (option) {
			case 1 -> addNew();
			case 2 -> readCantante();
			case 3 -> deleteCantante();
			case 4 -> System.out.println("Hasta luego!");
			default -> System.out.println("Opción inválida, intente nuevamente");
			}
		}while(option != 4);
		readCantante();
	}

	public static CantanteFamoso crear() {

		System.out.println("Ingrese el nombre del cantante");
		String nombre = scan.next();
		System.out.println("Ingrese el disco con más ventas");
		String disco = scan.next();

		return new CantanteFamoso(nombre, disco);

	}

	public static void addNew() {
		String respuesta;
		do {
			lista.add(crear());

			System.out.println("Desea agregar otro cantante? ");
			respuesta = scan.next();

			while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
				System.out.println("Respuesta inválida, intente nuevamente");
				respuesta = scan.next();
			}

		} while (respuesta.equalsIgnoreCase("s"));
	}

	public static void readCantante() {
		for (CantanteFamoso cantantes : lista) {
			System.out.println(cantantes);
		}
	}

	public static void deleteCantante() {

		System.out.println("Ingrese el nombre del cantante que desea eliminar");
		String nombre = scan.next();

		Iterator<CantanteFamoso> it = lista.iterator();

		while (it.hasNext()) {
			CantanteFamoso cantantes = (CantanteFamoso) it.next();
			if (cantantes.getNombre().equalsIgnoreCase(nombre))
				;
			lista.remove(cantantes);
			System.out.println("Cantante eliminado exitosamente");
		}
	}
	
}
