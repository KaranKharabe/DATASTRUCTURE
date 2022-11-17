package datastructure.arrays.java;

import java.util.Scanner;

public class MyIOService {
	public static int getInteger(String msgToPrint) {
		System.out.println(msgToPrint);
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();	
		return temp;
	}

}
