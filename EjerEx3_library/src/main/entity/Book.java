/**
 * 
 */
package main.entity;

import java.util.Objects;

/**
 * @author yessa
 * Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
Métodos Setters/getters
 */
public class Book {
	private String nombre;
	private String autor;
	private int cantEjemplares;
	private int cantPrestada;
	/**
	 * 
	 */
	public Book() {
	}
	/**
	 * @param nombre
	 * @param autor
	 * @param cantEjemplares
	 * @param cantPrestada
	 */
	public Book(String nombre, String autor, int cantEjemplares, int cantPrestada) {
		this.nombre = nombre;
		this.autor = autor;
		this.cantEjemplares = cantEjemplares;
		this.cantPrestada = cantPrestada;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the cantDisponible
	 */
	public int getCantEjemplares() {
		return cantEjemplares;
	}
	/**
	 * @param cantEjemplares the cantDisponible to set
	 */
	public void setcantEjemplares(int cantEjemplares) {
		this.cantEjemplares = cantEjemplares;
	}
	/**
	 * @return the cantPrestada
	 */
	public int getCantPrestada() {
		return cantPrestada;
	}
	/**
	 * @param cantPrestada the cantPrestada to set
	 */
	public void setCantPrestada(int cantPrestada) {
		this.cantPrestada = cantPrestada;
	}
	@Override
	public String toString() {
		return "Book [nombre=" + nombre + ", autor=" + autor + ", cantEjemplares=" + cantEjemplares + ", cantPrestada="
				+ cantPrestada + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor, cantEjemplares, cantPrestada, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(autor, other.autor) && cantEjemplares == other.cantEjemplares
				&& cantPrestada == other.cantPrestada && Objects.equals(nombre, other.nombre);
	}
	
	
}
