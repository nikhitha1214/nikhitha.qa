package core;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	  
	 public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>(); 
	  list.add("Ravi"); 
	  list.add("Vijay");  
	  list.add("Ravi");  
	  list.add("Ajay");  
	  //Traversing list through Iterator  
	  Iterator itr=list.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }
	   System.out.println("using foreach");  
	   for(String obj:list)  
		    System.out.println(obj);  
	  
	 }  
	} 

