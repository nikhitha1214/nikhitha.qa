package core;

public class Constructor {
	
	public Constructor(){
		System.out.println("I am a default constructor");
	}
	
	public Constructor(int i){
		
		System.out.println("I am a parameterized constructor "+ i);	
	}

	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(12);
		
	}

}
