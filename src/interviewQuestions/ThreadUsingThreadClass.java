package interviewQuestions;


//Creating thread by Extending Thread Class

class abc extends Thread
{
	public void run() {
		
		for(int i=0;i<5;i++)
		{System.out.println("Thread is created->"+i);
		}
	}
	
}

public class ThreadUsingThreadClass {
	
	public static void main(String[] args) {

		abc a=new abc();
		a.start();
		abc b=new abc();
		b.start();
		
		//Here two different thread will be started at the same time
		//always call start() method on object to create a thread

	}

}
