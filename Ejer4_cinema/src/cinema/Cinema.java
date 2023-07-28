/**
 * 
 */
package cinema;

import cinema.service.MovieService;

/**
 *@author yessa
 *  
 */
public class Cinema {
	public static void main(String[] args) {
		
		MovieService ms = new MovieService();
		
		ms.menu();
		
	}
}
