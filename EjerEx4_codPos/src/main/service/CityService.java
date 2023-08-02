/**
 * 
 */
package main.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import main.entity.City;

/**
 * @author yessa
 */
public class CityService {
	HashMap<Integer, String> cities = new HashMap();
	static Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	
	public void menu() {
		int option;
		System.out.println("MENU DEL SISTEMA: ");
		do {
			System.out.println();
			System.out.print("Seleccione una opción\n"
					+ "1. Registrar Ciudad.\n"
					+ "2. Mostrar ciudades registradas.\n"
					+ "3. Buscar ciudad por nombre.\n"
					+ "4. Buscar ciudad por código postal.\n"
					+ "5. Eliminar ciudad del registro.\n"
					+ "6. Salir.\nOpción: ");
				option = scan.nextInt();
				switch (option) {
				case 1 -> addCity();
				case 2 -> readAll();
				case 3 -> readOneByCity();
				case 4 -> readOneByCode();
				case 5 -> delete();
				case 6 -> System.out.println("Hasta luego!");
				default -> System.out.println("Opción inválida, intente nuevamente.");
				}			
		} while (option !=6);
	}

	public City crear() {

		System.out.println("Ingrese el código postal");
		int cp = scan.nextInt();
		System.out.println("Ingrese la ciudad correspondiente");
		String city = scan.next();

		return new City(cp, city);
	}

	public void addCity() {
		String option;
		do {
			City c = crear();

			cities.put(c.getCp(), c.getCityName());
			System.out.println("Desea ingresar otra ciudad??");
			option = scan.next();
			while (!option.equalsIgnoreCase("s") && !option.equalsIgnoreCase("n")) {
				System.out.println("Opción inválida, intente nuevamente.\nDesea ingresar otra ciudad? s/n");
				option = scan.next();
			}

		} while (option.equalsIgnoreCase("s"));

	}

	public void readAll() {
		if (cities.isEmpty()) {
			System.out.println("La lista no tiene ciudades registradas");
		} else {
			for (Map.Entry<Integer, String> auxiliar : cities.entrySet()) {

				System.out.println("Código Postal: " + auxiliar.getKey() + ", Ciudad: " + auxiliar.getValue());

			}
		}
	}

	public void readOneByCity() {
		boolean bandera = false;
		if (cities.isEmpty()) {
			System.out.println("No hay ciudades registradas.");
		} else {

			System.out.println("Ingrese el nombre de la ciudad que desea buscar: ");
			String city = scan.next();

			for (Map.Entry<Integer, String> aux : cities.entrySet()) {

				if (aux.getValue().equalsIgnoreCase(city)) {
					System.out.println();
					System.out.println("Los datos son los siguientes: ");
					System.out.println("Código Postal: " + aux.getKey() + ", Ciudad: " + aux.getValue());
					bandera = true;
					break;
				}
			}
			if (!bandera) {
				System.out.println("La ciudad ingresada no fue encontrada.");
			}
		}
	}

	public void readOneByCode() {
		boolean bandera = false;
		if (cities.isEmpty()) {
			System.out.println("No hay ciudades registradas.");
		} else {
			System.out.println("Ingrese el código postal de la ciudad que desea buscar: ");
			int cp = scan.nextInt();

			for (Map.Entry<Integer, String> aux : cities.entrySet()) {

				if (cp == aux.getKey()) {
					System.out.println();
					System.out.println("Los datos son los siguientes: ");
					System.out.println("Código Postal: " + aux.getKey() + ", Ciudad: " + aux.getValue());
					bandera = true;
					break;
				}
			}
			if (!bandera) {
				System.out.println("El código postal ingresado no fue encontrado.");
			}
		}
	}

	public void delete() {
		String respuesta;
		boolean bandera = false;
		if (cities.isEmpty()) {
			System.out.println("No hay ciudades registradas para eliminar");
		} else {
			do {
				System.out.println("Ingrese el nombre de la ciudad que desea eliminar");
				String city = scan.next();
				for (Map.Entry<Integer, String> aux : cities.entrySet()) {
					if (aux.getValue().equalsIgnoreCase(city)) {
						cities.remove(aux.getKey());
						System.out.println("La ciudad fue removida exitosamente.");
						bandera = true;
						break;
					} else {
						bandera = false;
					}
				}
				if (!bandera) {
					System.out.println("No encontró la ciudad en el registro");
				}
				System.out.println();
				System.out.println("Desea eliminar otra ciudad? ");
				respuesta = scan.next();

			} while (respuesta.equalsIgnoreCase("s") && !cities.isEmpty());
		}
	}

}
