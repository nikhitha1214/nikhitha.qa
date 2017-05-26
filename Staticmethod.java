package core;

public class Staticmethod {
	
		   int no;  
		   String name;  
		   static String clz="lbrce";  
		     
		   Staticmethod(int r,String n){  
			   no = r;  
			   name = n;  
		   }  
		   
		   static void change(){
			   
			   clz="MIC";
		   }
		 void display (){
			 System.out.println(no+" "+name+" "+clz);
			 }  
		  
		 public static void main(String args[]){  
			 
		Staticmethod.change();
			 
		Staticmethod s1 = new Staticmethod(1,"hari");
		Staticmethod s2 = new Staticmethod(2,"nikki");
		   
		 s1.display();  
		 s2.display();  
		 }  
		}  

