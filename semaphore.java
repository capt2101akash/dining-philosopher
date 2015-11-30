package philosopher;

public class semaphore	{
			private int val;
			public semaphore(int i)
			{
				val=i;
			}
			public semaphore()
			{
				val=0;
			}
			public synchronized void Wait_for_turn()
			{
				val--;
				if (val<0)
				{	
					try
					{
						wait();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
			public synchronized void pick_the_chopsticks()
			{
				val++;
				if(val<=0)
				{
					notify();
				}
			}

}
