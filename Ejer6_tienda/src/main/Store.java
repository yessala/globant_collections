/**
 * 
 */
package main;

import main.service.ProductService;

/**
 *@author yessa 
 */
public class Store {
	public static void main(String[] args) {
		ProductService ps = new ProductService();
		
		ps.menu();
	}
}
