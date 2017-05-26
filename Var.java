package core;

public class Var 
	{
		int c = 2; // instance var ---> declared inside a class but outsidea method.
		static int d = 14;
		public static void main(String[] args) 
		{
			int a = 5; // local var ---> inside a method
			int b = 6;
			System.out.println(a);
			System.out.println(a+b);
	System.out.println(d);
			Var v = new Var();
			//System.out.println(v.c);
			v.m1();
			
		}
		void m1()
		{
		System.out.println(c);
		System.out.println(d);
		}
	}


