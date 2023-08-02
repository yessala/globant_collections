/**
 * 
 */
package main.entity;

import java.util.Objects;

/**
 * @author yessa
 */
public class City {
	private Integer cp;
	private String cityName;
	/**
	 * 
	 */
	public City() {
	}
	/**
	 * @param cp
	 * @param cityName
	 */
	public City(Integer cp, String cityName) {
		this.cp = cp;
		this.cityName = cityName;
	}
	/**
	 * @return the cp
	 */
	public Integer getCp() {
		return cp;
	}
	/**
	 * @param cp the cp to set
	 */
	public void setCp(Integer cp) {
		this.cp = cp;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "City [cp=" + cp + ", cityName=" + cityName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cityName, cp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityName, other.cityName) && Objects.equals(cp, other.cp);
	}
	
	
}
