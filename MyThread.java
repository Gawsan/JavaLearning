//main thread create child thread 
public class MyThread extends Thread {
	//over ride the run method
	public void run() {
		
		//job of thread 
		for(int i=0;i<5;i++) {
			System.out.println("I am Child thread");
		}
	}
	
	public static void main(String [] args) {
		
		int j=010;
		int k=07;
		//main thread create child thread
		//thread initializing
		MyThread  t=new MyThread ();
		//main thread start child thread
		t.start();
		//after t.start 2 thread
		//executed by main thread 
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
		System.out.println(j+""+k);
	}

}
 