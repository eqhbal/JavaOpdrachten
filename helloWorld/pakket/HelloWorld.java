package helloWorld.pakket; //lab oefening H2 4

import java.util.Scanner;
import static java.lang.Math.abs;

/**
 * Dit is de Lab oefening H2 5.
 */

public class HelloWorld{
	public static void main(String[] args){

		//lab oefening H2 1 t/m 3
		System.out.println("Hello World!");

		//lab oefening H2 6
		Scanner in = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = in.nextLine();
		System.out.println("Username is: " + userName);

		int plusTwo = abs(-2);
		System.out.println(plusTwo);


	}

}