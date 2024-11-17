package programs;


class Queue
{
	int x;
	void store (int j)
	{
		x=j;
		System.out.println("Produced"+x);
	}
	void retrieve()
	{
		System.out.println("Consumed"+x);
	}
}

class Producer extends Thread
{
	Queue a;
	Producer(Queue q)
	{
		a=q;
		
	}
	public void run()
	{
		int i=1;
		for(int m=1;m<=50;m++)
		{
			a.store(i++);
			
		}
	}
}

class Consumer extends Thread
{
	Queue b;
	Consumer(Queue q)
	{
		b=q;
		
	}
	public void run()
	{
			for(int n=1;n<=50;n++)
		{
			b.retrieve();
			
		}
	}
}

public class ProdConsEx {

	public static void main(String[] args) {
		
		Queue q =new Queue();
		Producer p= new Producer(q);
		Consumer c= new Consumer(q);
		p.start();
		c.start();
 	}

}
