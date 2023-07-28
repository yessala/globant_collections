/**
 * 
 */
package cinema.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import cinema.entity.Movie;
import cinema.utilities.Comparadores;

/**
 * @author yessa
 */
public class MovieService {
	ArrayList<Movie> movieList;
	Scanner scan = new Scanner(System.in).useDelimiter("\r\n");

	public MovieService() {
		this.movieList = new ArrayList();
	}

	public void menu() {
		String option;
		System.out.println("Welcome to the cinema");
		do {
			System.out.println("Please, select your option\n" + "1. Register movie\n" + "2. Show movies\n"
					+ "3. Show long movies\n" + "4. Delete movie\n" + "5. Order movies...\n" + "6. Exit");
			option = scan.next();
			switch (option) {
			case "1" -> setMovie();
			case "2" -> showMovie();
			case "3" -> showMovieLong();
			case "4" -> deleteMovie();
			case "5" -> menuOrder();
			case "6" -> System.out.println("Hasta luego!");
			default -> System.out.println("Unvalid Option");
			}
		} while (!option.equalsIgnoreCase("6"));
	}

	public Movie crearMovie() {
		System.out.println("Enter the movie's title");
		String title = scan.next();
		System.out.println("Enter the movie's director");
		String director = scan.next();
		System.out.println("Enter the movie's minutes log");
		int minutes = scan.nextInt();
		return new Movie(title, director, minutes);
	}

	public void setMovie() {
		String select;
		do {
			movieList.add(crearMovie());
			System.out.println("Quisiera agregar otra pelicula? S/N");
			select = scan.next();
		} while (select.equalsIgnoreCase("s"));

	}

	public void showMovie() {
		System.out.println("");
		if (movieList.isEmpty()) {
			System.out.println("There aren't movie registered");
		} else {
			for (Movie aux : movieList) {
				System.out.println(aux);
			}
		}
	}

	public void showMovieLong() {
		System.out.println("");
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getMinutes() >= 60) {
				System.out.println(movieList.get(i));
			}
		}
	}

	public void deleteMovie() {
		System.out.println("");
		if (movieList.isEmpty()) {
			System.out.println("There aren't movie to delete");
		} else {
			System.out.println("");
			System.out.println("Enter the movie's name to delete");
			String name = scan.next();
			boolean bandera = false;

			for (int i = 0; i < movieList.size(); i++) {
				if (movieList.get(i).getTitle().equalsIgnoreCase(name)) {
					movieList.remove(i);
					bandera = true;
					break;
				}
			}
			if (bandera == false) {
				System.out.println("Can not find the movie to delete");
			}
		}
	}

	public void orderTimeDesc() {
		System.out.println("");
		if (movieList.isEmpty() || movieList.size() <= 1) {
			System.out.println("There aren't enought movie registered to order");
		} else {
			Collections.sort(movieList, Comparadores.OrderByTimeDesc);
			System.out.println("-----Order by time descending-----");
			showMovie();
		}
	}

	public void orderTimeAsc() {
		System.out.println("");
		if (movieList.isEmpty() || movieList.size() <= 1) {
			System.out.println("There aren't enought movie registered to order");
		} else {
			Collections.sort(movieList, Comparadores.OrderByTimeAsc);
			System.out.println("-----Order by time ascending-----");
			showMovie();
		}
	}

	public void orderTitle() {
		System.out.println("");
		if (movieList.isEmpty() || movieList.size() <= 1) {
			System.out.println("There aren't enought movie registered to order");
		} else {
			Collections.sort(movieList, Comparadores.OrderByTitle);
			System.out.println("-----Order by time title-----");
			showMovie();
		}
	}

	public void orderDirector() {
		System.out.println("");
		if (movieList.isEmpty() || movieList.size() <= 1) {
			System.out.println("There aren't enought movie registered to order");
		} else {
			Collections.sort(movieList, Comparadores.OrderByDirector);
			System.out.println("-----Order by time director-----");
			showMovie();
		}
	}

	public void menuOrder() {
		String option;
		System.out.println("How do you want to order the list?");
		do {
			System.out.println("Please, select your option\n" + "1. by Time descending\n" + "2. by Time ascending\n"
					+ "3. by Title\n" + "4. By director\n" + "5. Go back to principal menu");
			option = scan.nextLine();

			switch (option) {
			case "1" -> orderTimeDesc();
			case "2" -> orderTimeAsc();
			case "3" -> orderTitle();
			case "4" -> orderDirector();
			case "5" -> System.out.println("");
			default -> System.out.println("Unvalid Option");
			}
		} while (!option.equalsIgnoreCase("5"));
	}
}
