
import java.util.Scanner;

import pkg1.Book;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Book Number of the Book");
		Scanner sc=new Scanner(System.in);
		int d1=sc.nextInt();		
		
		System.out.println("Enter the Title of the Book");
		String d2=sc.next();
		
		System.out.println("Enter the Author of the Book");
		String d3=sc.next();
		
		System.out.println("Enter the Price of the Book");
		float d4=sc.nextFloat();
		
		Book b1=new Book(d1,d2,d3,d4);
		b1.setBookNo(d1);
		b1.setTitle(d2);
		b1.setAuthor(d3);
		b1.setPrice(d4);
		sc.close();
		
		b1.display();
		
		
		
		Book b2=new Book(d1, d2, d3, d4);
		
		b2.setBookNo(d1);
		b2.setTitle(d2);
		b2.setAuthor(d3);
		b2.setPrice(d4);
		sc.close();
		
		b2.display();
	}
}
