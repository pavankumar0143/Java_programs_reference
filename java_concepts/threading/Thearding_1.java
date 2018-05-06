/*
 * extends Thread
 * create public void run(){logic}
 * In main
 * A o=new A();o.start();
 */
public class Thearding_1 implements Runnable
{
	/*public void even()
	{
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println(i);
		}
	}
	public void odd()
	{
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);
		}
	}*/
	public void run(){
		
		for(int i=1;i<=10;i++)
		{	
			System.out.println(i);
	
				
				System.out.println(Thread.currentThread().getName());
				/*catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Thearding_1 th=new Thearding_1();
		/*Thread th1=new Thread(th);
		System.out.println(th1.isAlive());
		th1.start();
		Thread.sleep(500);
		System.out.println(th1.isAlive());
		Thearding_1 th2=new Thearding_1();
		Thread th23=new Thread(th2);
		System.out.println(th1.isAlive());
		th23.start();
		Thread.sleep(300);
		System.out.println(th1.isAlive());
		*/
		Thread th1=new Thread(th);
		Thearding_1 th_1=new Thearding_1();
		Thread th2=new Thread(th_1);
		
		Thearding_1 th_2=new Thearding_1();
		Thread th3=new Thread(th_2);
		
		th1.setPriority(10);
		th2.setPriority(5);
		th3.setPriority(1);
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("______________\n"+th1.getPriority()+"\n"+th2.getPriority()+"\n"+th3.getPriority()+"\n______________\n");
		
	}
}
