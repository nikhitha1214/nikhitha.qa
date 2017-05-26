package core;


public	class ThreadInterface implements Runnable
	{
		public void run()
		{
			for(int i=0;i<=10;i++ )
				{
		
						System.out.println("Child class run method"); // executed by child
				}
		}
		public static void main(String[] args) 
		{
			ThreadInterface r = new ThreadInterface();
			Thread t = new Thread(r);
			t.start();
				for(int i=0;i<=10;i++ )
					{
		
						System.out.println("Main method"); // executed by main
					}
		}
	
}
