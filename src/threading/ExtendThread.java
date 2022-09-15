package threading;

class ExThread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
 	}
}

class ExtendThread
{
 	public static void main(String args[])
 	{
  		ExThread mt = new  ExThread();
  		mt.start();
 	}
}
