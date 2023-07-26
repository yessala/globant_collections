/**
 * 
 */
package yess.cinema.entidad;

/**
 * 
 */
public class Movie {
	private String title;
	private String director;
	private int minutes;
	
	public Movie() {
	}

	public Movie(String title, String director, int minutes) {
		this.title = title;
		this.director = director;
		this.minutes = minutes;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", minutes=" + minutes + "]";
	}
	
	
	
}
