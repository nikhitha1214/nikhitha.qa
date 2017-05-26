package core;

public class Instancevar {
	
int i;
	
	
	public void hi(int j){
		i = j;
		System.out.println("Hello " +i+" "+"How are you ?");
	}

	public static void main(String[] args) {
		
		Instancevar ins = new Instancevar();
		ins.hi(12);

	}

}
