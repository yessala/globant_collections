/**
 * 
 */
package ejer2.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author yessa 
 * 
 *         Continuando el ejercicio anterior, después de mostrar los
 *         perros, al usuario se le pedirá un perro y se recorrerá la lista con
 *         un Iterator, se buscará el perro en la lista. Si el perro está en la
 *         lista, se eliminará el perro que ingresó el usuario y se mostrará la
 *         lista ordenada. Si el perro no se encuentra en la lista, se le
 *         informará al usuario y se mostrará la lista ordenada.
 *         
 */
public class RazaService {

	private Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	List<String> razaList;

	public RazaService() {
		this.razaList = new ArrayList<>();
	}

	public void menu() {
		int option;
		System.out.println("Bienvenido");
		do {
			System.out.print("Que desea realizar?\n" + "1. Registrar raza\n" + "2. Mostrar lista\n"
					+ "3. Buscar y eliminar\n" + "4. Salir\n" + "Opción: ");
			option = scan.nextInt();
			switch (option) {
			case 1 -> registrar();
			case 2 -> mostrar();
			case 3 -> eliminar();
			case 4 -> System.out.println("Hasta luego");
			default -> System.out.println("Opcion inválida");
			}
		} while (option != 4);
	}

	public String crear() {
		System.out.println("Ingrese la raza de perro que desea registrar");
		String dato = scan.next();
		return dato;
	}

	public void registrar() {
		String option;
		do {
			razaList.add(crear());
			System.out.println("Desea agregar otra raza?? S/N");
			option = scan.next();
		} while (option.equalsIgnoreCase("s"));

	}

	public void mostrar() {
		System.out.println("");
		if (!razaList.isEmpty()) {
			for (String raza : razaList) {
				System.out.println(raza);
			}
		} else {
			System.out.println("No hay elementos en la lista");
		}
	}

	public void mostrarOrdenada() {
		if (!razaList.isEmpty() && razaList.size() > 1) {
			Collections.sort(razaList);
			mostrar();
		} else {
			System.out.println("No hay suficientes elementos en la lista para ordenar");
		}
	}

	public void eliminar() {
		System.out.println("");
		if (razaList.isEmpty()) {
			System.out.println("No hay elementos en la lista");
		} else {
			System.out.println("Ingrese raza que desea buscar y eliminar de la lista");
			String find = scan.next();
			boolean bandera = false;
			Iterator<String> it = razaList.iterator();
			while (it.hasNext() && bandera == false) {
				if (it.next().equalsIgnoreCase(find)) {
					it.remove();
					System.out.println(find + " ha sido encontrada y eliminada\n");
					mostrarOrdenada();
					bandera = true;
				}
			}
			if (bandera == false) {
				System.out.println("No se encontró la raza ingresada\n");
				mostrarOrdenada();
			}
		}
	}
}
