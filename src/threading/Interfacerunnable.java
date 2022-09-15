package threading;
class MyThread implements Runnable
{
      String message;
      MyThread(String msg)
      {
            message = msg;
      }
      public void run()
      {
            for(int count=0;count<=5;count++)
            {
                  try
                  {
                        System.out.println("Run method: " + message);
                        Thread.sleep(100);
                  }
                  catch (InterruptedException ie)
                  {
                        System.out.println("Exception in thread: "+ie.getMessage());
                  }
            }
      }
}
public class Interfacerunnable
{
      public static void main(String[] args)
      {
             MyThread obj1 = new MyThread("MyThread obj1");
             MyThread obj2 = new MyThread("MyThread obj2");
             MyThread obj3 = new MyThread("MyThread obj3");
             MyThread obj4 = new MyThread("MyThread obj4");
             Thread t1 = new Thread(obj1);
             Thread t2 = new Thread(obj2);
             Thread t3 = new Thread(obj3);
             Thread t4 = new Thread(obj4);
             t1.start();
             t2.start();
             t3.start();
             t4.start();
      }
}
