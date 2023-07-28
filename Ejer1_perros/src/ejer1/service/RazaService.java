/**
 * 
 */
package ejer1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejer1.entity.Raza;

/**
 * @author yessa
 * 
 */
public class RazaService {
	private Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	List<Raza> razaList;
	
	
	
	public RazaService() {
		this.razaList = new ArrayList<>();
	}

	public Raza crear() {
		System.out.println("Ingrese la raza de perro que desea registrar");
		String dato = scan.next();
		return new Raza(dato);
	}
	
	public void registrar() {
		String option;
		System.out.println("Registrando raza de perros: ");
		do {
			razaList.add(crear());
			System.out.println("Desea agregar otra raza?? S/N");
			option = scan.next();			
		}while(option.equalsIgnoreCase("s"));
		
		for (Raza can : razaList) {
			System.out.println(can);
		}
	}
}
