package core;

public class Methodoverloading {
	
	public void m1(int i){
		System.out.println("i am "+i);
	}
	
	public void m1(int i,int j){
		System.out.println("i am "+i +" came along with " +j);
	}

	public static void main(String[] args) {
		Methodoverloading m = new Methodoverloading();
		m.m1(12);
		m.m1(12, 14);
	}

}
