/**
 * 
 */
package main.entity;

import java.util.Objects;

/**
 * @author yessa
 */
public class CantanteFamoso {
	private String nombre;
	private String discoMasVendido;
	/**
	 * 
	 */
	public CantanteFamoso() {
	}
	/**
	 * @param nombre
	 * @param discoMasVendido
	 */
	public CantanteFamoso(String nombre, String discoMasVendido) {
		this.nombre = nombre;
		this.discoMasVendido = discoMasVendido;
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
	 * @return the discoMasVendido
	 */
	public String getDiscoMasVendido() {
		return discoMasVendido;
	}
	/**
	 * @param discoMasVendido the discoMasVendido to set
	 */
	public void setDiscoMasVendido(String discoMasVendido) {
		this.discoMasVendido = discoMasVendido;
	}
	@Override
	public String toString() {
		return "CantateFamoso [nombre=" + nombre + ", discoMasVendido=" + discoMasVendido + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(discoMasVendido, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CantanteFamoso other = (CantanteFamoso) obj;
		return Objects.equals(discoMasVendido, other.discoMasVendido) && Objects.equals(nombre, other.nombre);
	}
	
	
}
