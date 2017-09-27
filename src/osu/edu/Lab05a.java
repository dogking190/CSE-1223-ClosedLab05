/*
 * Lab05a.java
 * 
 * @author Paul Onderisin
 * @verison 1.0.0
 * 
 * takes a string and counts the digits in the said string
 */
package osu.edu;

import java.util.Scanner;

public class Lab05a {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int digits  = 0;
		
		System.out.print("Please enter a string: ");
		
		String _usr = scan.nextLine();
		
		for (char c : _usr.toCharArray()) {
			if(Character.isDigit(c)) {
				digits++;
			}
		}
		
		if(digits != 0)
		{
			System.out.println("Your string contains " + digits + " digits.");
		}
		else
		{
			System.out.println("Your string contains no digits.");
		}
		
		scan.close();

	}

}
