package core;

public class Staticvar {
	
		   int no;  
		   String name;  
		   static String clz="lbrce";  
		     
		   Staticvar(int r,String n){  
		  no = r;  
		   name = n;  
		   }  
		 void display (){System.out.println(no+" "+name+" "+clz);}  
		  
		 public static void main(String args[]){  
			 
		Staticvar s1 = new Staticvar(1,"hari");
		Staticvar s2 = new Staticvar(2,"nikki");
		   
		 s1.display();  
		 s2.display();  
		 }  
		}  

