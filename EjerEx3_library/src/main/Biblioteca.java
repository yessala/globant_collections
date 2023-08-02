/**
 * 
 */
package main;

import main.service.BookService;

/**
 * @author yessa
 */
public class Biblioteca {
	public static void main(String[] args) {
		BookService bs = new BookService();
		
		bs.menu();
		
	}
}
