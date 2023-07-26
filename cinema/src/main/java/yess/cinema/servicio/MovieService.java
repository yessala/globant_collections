/**
 * 
 */
package yess.cinema.servicio;

import java.util.ArrayList;
import java.util.Scanner;

import yess.cinema.entidad.Movie;

/**
 * 
 */
public class MovieService {

	ArrayList<Movie> movieList;
	Scanner scan = new Scanner(System.in);
	public MovieService() {
		this.movieList = new ArrayList();
	}
	
	public Movie crearMovie() {
		System.out.println("Ingrese titulo");
		String title = scan.nextLine();
		System.out.println("Ingrese director");
		String director = scan.nextLine();
		System.out.println("Ingrese duracion en minutos");
		int minutes = scan.nextInt();
		
		return new Movie(title,director,minutes); 
	}
	
	public void setMovie() {
		boolean bandera = false;
		do {
			movieList.add(crearMovie());
			System.out.println("Quisiera agregar otra pelicula? S/N");
			String select = scan.nextLine();
			
				if (select.equalsIgnoreCase("S")) {
					bandera = false;
				} else {
					bandera= true;
				}
		} while (bandera == false);
		
	}
	
	public void showMovie() {
		for (Movie aux : movieList) {
			System.out.println(aux);			
		}
	}
	
	
	
}
