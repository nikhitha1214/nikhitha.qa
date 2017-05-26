package core;

 class B 
	{	  
		void run(){
			System.out.println("Vehicle is running");
			}  
	}  
public class MethodOverriding extends B
{  
		void run(){
			System.out.println("Bike is running safely");
			}  
		  
		public static void main(String args[]){  
		MethodOverriding obj = new MethodOverriding();  
		obj.run();  
		}  
}
