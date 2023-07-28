/**
 * 
 */
package ejer1.entity;

import java.util.Objects;

/**
 * @author yessa
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
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
