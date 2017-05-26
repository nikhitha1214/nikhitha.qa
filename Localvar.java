package core;

public class Localvar {
		
	public void hi(){
		int i=15;
		System.out.println("Hello " +i+" "+"How are you ?");
	}

	public static void main(String[] args) {
		
		Localvar l= new Localvar();
		l.hi();

	}

}
