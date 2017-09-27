/**
 * Lab05b.java
 * 
 * Enter a number and then do the Hailstone Series
 * 
 * @author Paul M Onderisin
 * @verison 1.0.0
 */
package osu.edu;

import java.util.Scanner;

/**
 */
public class Lab05b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Positive number please: ");
		
		int num = scan.nextInt();
		
		while(num != 1) {
			System.out.print(num + ", ");
			
			if(num%2 == 0)
			{
				num = num/2;
			}
			else
			{
				num = (3 * num) + 1;
			}
		}
		
		System.out.print(num + "");
		
		scan.close();

	}

}
