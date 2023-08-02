/**
 * 
 */
package main.service;

import java.util.HashSet;
import java.util.Scanner;

import main.entity.Book;

/**
 * @author yessa
 */
public class BookService {

	static Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	HashSet<Book> bookList = new HashSet<>();
	
	public void menu() {
		System.out.println("Bienvenido a la Biblioteca Nacional");
		int option;
		do {
			System.out.println("");
			System.out.print("Que desea realizar\n"
					+ "1. Agregar libros al inventario\n"
					+ "2. Mostrar libros\n"
					+ "3. Prestar libro\n"
					+ "4. Devolver libro\n"
					+ "5. Salir.\nOpcion: ");
			option = scan.nextInt();
			switch (option) {
			case 1 -> addBook();
			case 2 -> read();
			case 3 -> System.out.println(prestamo());
			case 4 -> System.out.println(devolucion());
			case 5 -> System.out.println("Hasta Luego");			
			default ->System.out.println("Opcion invalida, intente nuevamente");
			}
		} while (option != 5);
	}

	public Book create() {
		Book b = new Book();
		System.out.println("Ingrese el nombre del libro.");
		b.setNombre(scan.next());
		System.out.println("Ingrese el nombre del autor del libro.");
		b.setAutor(scan.next());
		System.out.println("Ingrese la cantidad de ejemplares existentes.");
		b.setcantEjemplares(scan.nextInt());
		System.out.println("Ingrese la cantidad de ejemplares prestados");
		b.setCantPrestada(scan.nextInt());

		return b;
	}

	public void addBook() {
		System.out.println();
		String option;
		do {
			bookList.add(create());
			System.out.println("Quiere agregar otro libro? s/n");
			option = scan.next();
			while (!option.equalsIgnoreCase("s") && !option.equalsIgnoreCase("n")) {
				System.out.println();
				System.out.println("Opción incorrecta, intente nuevamente.\n" + "Desea agregar otro libro? s/n");
				option = scan.next();
			}
		} while (option.equalsIgnoreCase("s"));
	}

	public void read() {
		if (bookList.isEmpty()) {
			System.out.println("No hay libros registrados");
		} else {
			for (Book libros : bookList) {
				System.out.println(libros);
			}
		}
	}

//	Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
//	en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
//	método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
//	prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
//	préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
//	disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
//	caso contrario.

	public boolean prestamo() {
		boolean disponible = false;;

		System.out.println("Ingrese el título del libro que solicita: ");
		String libro = scan.next();

		for (Book libros : bookList) {
			if (libros.getNombre().equalsIgnoreCase(libro)) {
				if (libros.getCantPrestada() < libros.getCantEjemplares()) {
					libros.setCantPrestada(libros.getCantPrestada() + 1);
					disponible = true;
					break;
				}
			}
		}
		return disponible;
	}
//	Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
//	busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
//	método decrementa de a uno, como un carrito de compras, el atributo ejemplares
//	prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
//	produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
//	ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
//	caso contrario.
	
	public boolean devolucion() {
		boolean devuelto = false;;

		System.out.println("Ingrese el título del libro que devuelve: ");
		String libro = scan.next();

		for (Book libros : bookList) {
			if (libros.getNombre().equalsIgnoreCase(libro)) {
				if (libros.getCantPrestada() == 0) {
					devuelto = false;
				}else {
				libros.setCantPrestada(libros.getCantPrestada()-1);	
				devuelto = true;
				}
			}
		}
		return devuelto;
	}
}
