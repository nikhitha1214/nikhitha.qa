package core;


	class Dummy 
	{	  
		void run(){
			System.out.println("Vehicle is running");
			}  
	}
public class Runtimepoly extends Dummy
{  
		void run(){
			System.out.println("Bike is running safely");
			}  
		  
		public static void main(String args[]){  
		Dummy obj = new Runtimepoly();  
		obj.run();  
		}  
}

