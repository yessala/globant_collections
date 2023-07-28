/**
 * 
 */
package ejer2.entity;

import java.util.Objects;

/**
 * @author yessa
 * 
 */
public class Raza {
	private String raza;

	public Raza() {
	}

	public Raza(String raza) {
		this.raza = raza;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Raza [raza=" + raza + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(raza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Raza other = (Raza) obj;
		return Objects.equals(raza, other.raza);
	}
}
