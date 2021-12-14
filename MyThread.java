package JavaTraining;

 public class MyThread {

	public static void main(String[] args) {
		ThreadTask t=new ThreadTask();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread1");
		}
	}
 }
	class ThreadTask extends Thread{
		
	public void run()
	{
		  for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	}

