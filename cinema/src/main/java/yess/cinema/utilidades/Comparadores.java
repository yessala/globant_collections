package yess.cinema.utilidades;

import java.util.Comparator;
import yess.cinema.entidad.Movie;

/**
 * @author yessa
 * Clase para los comparadores de las Collections
 */
public class Comparadores {
	
	public static Comparator<Movie> OrderByTimeDesc = new Comparator<Movie> () {
		@Override
		public int compare(Movie o1, Movie o2) {
			return o2.getMinutes().compareTo(o1.getMinutes());
		}
	};
	}