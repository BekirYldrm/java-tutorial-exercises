package multiThreading;



//extends Thread  Class
class Task1 extends Thread{
	
	public void run() {
		System.out.println("\nTask1 Started");
		for(int i = 0 ; i<100 ; i++){
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}

//implements Runnable Interface
class Task2 implements Runnable{
	

	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for(int i = 100; i<200 ; i++) {
			System.out.print(i + " ");	
		}
		System.out.println("\nTask2 Done");
		
	}
	
}


public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		
		//Task1 (extends Thread Class)
		Task1 task1 = new Task1(); 
		task1.setPriority(1); //priority of a thread
		task1.start(); 

		
		
		//Task2 (implements Runnable Interface)
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10); //priority of a thread
		task2Thread.start();
		
		
		//Communication between threads
		task1.join();
		task2Thread.join();
		

		//Task3
		System.out.println("\nTask3 Started");
		for(int i = 200; i<300 ; i++) {
			System.out.print(i + " ");	
		}
		System.out.println("\nTask3 Done");

	}

}
