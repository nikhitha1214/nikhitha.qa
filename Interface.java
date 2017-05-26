package core;

 interface I{
	void implmethod();
}

public class Interface implements I{
	
	
	public void implmethod(){
		System.out.println("I am implementing the interface");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i= new Interface();
		i.implmethod();

	}

}
