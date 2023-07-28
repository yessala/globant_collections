/**
 * 
 */
package cinema.entity;

import java.util.Objects;

/**
 * @author yessa
 */
public class Movie {
	private String title;
	private String director;
	private Integer minutes;
	
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
	public Integer getMinutes() {
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

	@Override
	public int hashCode() {
		return Objects.hash(director, minutes, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(director, other.director) && Objects.equals(minutes, other.minutes)
				&& Objects.equals(title, other.title);
	}
}
