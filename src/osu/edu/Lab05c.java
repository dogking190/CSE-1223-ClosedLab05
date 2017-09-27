/**
 * Lab05c.java
 * 
 * Reverse a String
 * 
 * @author Paul M Onderisin
 * @verison 1.0.0
 */
package osu.edu;

import java.util.Scanner;

public class Lab05c {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a string to reverse: ");
		String s = scan.nextLine();
		
		char[] sArray = s.toCharArray();
		
		for(int i = sArray.length-1;i >= 0;i--) {
			System.out.print(sArray[i]);
		}
		
		scan.close();
	}
}
