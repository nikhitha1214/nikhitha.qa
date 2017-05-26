package core;

import java.util.Scanner;

public class Dt {
	public int num()
	{
		int n;
		System.out.println("Enter a num:");
		
		Scanner sc = new Scanner(System.in); 
		n = sc.nextInt();
		
		System.out.println("The entered num is : "+ n);
		return n;
		
	}
	public static void main(String[] args) {
		
		Dt d = new Dt();
		d.num();
		

	}

}
