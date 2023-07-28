/**
 * 
 */
package cinema.utilities;

import java.util.Comparator;

import cinema.entity.Movie;

/**
 * 
 */
public class Comparadores {
	
	public static Comparator<Movie> OrderByTimeDesc = new Comparator<Movie> () {
		@Override
		public int compare(Movie o1, Movie o2) {
			return o2.getMinutes().compareTo(o1.getMinutes());
			}
	};
	
	public static Comparator<Movie> OrderByTimeAsc = new Comparator<Movie> () {
		@Override
		public int compare(Movie o1, Movie o2) {
			return o1.getMinutes().compareTo(o2.getMinutes());
			}
	};
	
	public static Comparator<Movie> OrderByTitle = new Comparator<Movie> () {
		@Override
		public int compare(Movie o1, Movie o2) {
			return o1.getTitle().compareTo(o2.getTitle());
			}
	};
	
	public static Comparator<Movie> OrderByDirector = new Comparator<Movie> () {
		@Override
		public int compare(Movie o1, Movie o2) {
			return o1.getDirector().compareTo(o2.getDirector());
			}
	};

}
