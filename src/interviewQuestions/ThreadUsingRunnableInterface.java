package interviewQuestions;


/***
 * 
 * @author SHISHU RAJ PANDEY
 * 
 * Different Methods of Threads-
 * run() - It is used to run the thread
 * start()- It is used to start the thread
 * sleep()- It is used to stop of execution of current thread for certain period of time
 * join()- Waits for current thread to die.
 * join(long miliseconds)- wait for current thread to die for the specified miliseconds
 * public int getPriority()- returns the priority of the thread
 * setPriority()- set the priority of thread
 * public String getName()- return the name of the thread.
 * setName(String name)- change the name of the thread
 * currentThread()- return the reference of currently executing thread
 * getState()- returns the state of the thread
 * isAlive- tests is thread is alive or not
 * yield()- causes the currently executing thread object to temporarly pause and allow other thread to execute
 * suspend()- to suspend the current thread
 * resume()- to resume the suspened thread
 * stop()- to stop the thread
 * isDaemon()- tests is the thread is a daemon thread
 * interrupt()- interrupts the thread
 * 
 * Different state of thread-
 * new,runnable, running, nonrunnable(blocked), terminated
 */

class runnableClass implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{System.out.println("Thread is created->"+i);
		}	
	
}
}
public class ThreadUsingRunnableInterface {

	public static void main(String[] args) {
	
		Thread t1=new Thread(new runnableClass());
	    Thread t2=new Thread(new runnableClass());
	    t1.start();
	    t2.start();
	    
	    
	    Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++)
				{System.out.println("Thread is created->"+i);
				}	
			}
		});

	}

}
