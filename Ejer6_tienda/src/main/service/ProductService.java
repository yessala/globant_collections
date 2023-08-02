package main.service;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import main.entity.Product;

/**
 * @author yessa
 */
public class ProductService {

	static Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	private HashMap<String, Double> productList = new HashMap();

	public void menu() {
		int option;
		System.out.println("Bienvenido al Sistema de Registro");

		do {
			System.out.print("Seleccione una opción\n" + "1. Crear nuevo producto\n" + "2. Mostrar lista de productos\n"
					+ "3. Modificiar precio de producto\n" + "4. Eliminar un producto\n" + "5. Salir\n" + "opcion: ");
			option = scan.nextInt();
			switch (option) {
			case 1 -> addProd();
			case 2 -> readLis();
			case 3 -> updatePrice();
			case 4 -> deleteProd();
			case 5 -> System.out.println("Hasta luego.");
			default -> System.out.println("Opción invalida, intente nuevamente.");
			}
		} while (option != 5);
	}

	public Product create() {

		Product p = new Product();

		System.out.println();
		System.out.println("Por favor, ingrese el nombre del producto: ");
		p.setName(scan.next());
		System.out.println("Ingrese el precio del producto: ");
		p.setPrice(scan.nextDouble());

		return p;
	}

	public void addProd() {
		String option;

		do {
			Product p = create();
			productList.put(p.getName(), p.getPrice());

			System.out.println("Desea ingresar otro producto? s/n");
			option = scan.next();

			while (!option.equalsIgnoreCase("s") && !option.equalsIgnoreCase("n")) {
				System.out.println();
				System.out.println("Opción incorrecta, intente nuevamente.\n" + "Desea ingresar otro producto? ");
				option = scan.next();
			}

		} while (option.equalsIgnoreCase("s"));

	}

	public void readLis() {
		if (productList.isEmpty()) {
			System.out.println("No hay productos registrados en la lista.");
		} else {
			for (Entry<String, Double> list : productList.entrySet()) {
				String prod = list.getKey();
				Double prec = list.getValue();

				System.out.println("Producto: " + prod + ", Precio: $" + prec);
			}
		}
	}

	public void updatePrice() {
		boolean bandera = false;
		System.out.println();
		if (productList.isEmpty()) {
			System.out.println("No hay productos registrados!");
		} else {
			System.out.println("Ingrese el nombre del producto que desea modificar: ");
			String product = scan.next();

			for (Entry<String, Double> list : productList.entrySet()) {
				String prod = list.getKey();
				Double prec = list.getValue();

				if (product.equalsIgnoreCase(prod)) {

					System.out.println("Ingrese el nuevo precio del producto");
					list.setValue(scan.nextDouble());
					System.out.println("El precio ha sido actualizado exitosamente.\n" + "Producto : " + list.getKey()
							+ ", Precio: " + list.getValue());
					bandera = true;
					break;
				}
			}
			if (!bandera) {
				System.out.println("El producto no fue entrado");
			}
		}
	}

	public void deleteProd() {
		boolean bandera = false;
		System.out.println();
		if (productList.isEmpty()) {
			System.out.println("No hay productos registrados!");
		} else {
			System.out.println("Ingrese el nombre del producto que desea eliminar: ");
			String product = scan.next();

			for (Entry<String, Double> list : productList.entrySet()) {
				String prod = list.getKey();
				Double prec = list.getValue();

				if (product.equalsIgnoreCase(prod)) {

					productList.remove(prod);
					System.out.println("El producto ha sido eliminado exitosamente.");

					bandera = true;
					break;
				}
			}
			if (!bandera) {
				System.out.println("El producto no fue entrado.");
			}
		}
	}
}
