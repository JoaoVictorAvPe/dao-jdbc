package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller se = new Seller(25, "Joao", "joao@hotmail.com", LocalDate.parse("08/03/2001", fmt), 4500.0);
		System.out.println(se);
	}

}
