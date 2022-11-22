package org.sample;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
				 
		System.out.println("student id");
		s.nextInt();
		System.out.println("student name");
		s.next();
		System.out.println("email");
		s.next();
		System.out.println("phone no");
		s.nextLong();
		System.out.println("dept");
		s.next();
		System.out.println("gender");
		s.next().charAt(0);
		System.out.println("city");
		s.next();
		
		
	
	
	}

}
