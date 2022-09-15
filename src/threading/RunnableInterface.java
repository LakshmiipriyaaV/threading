package threading;

class Run implements Runnable
{
    public void run()
    {
        System.out.println("concurrent thread started running..");
    }
}

class RunnableInterface
{
    public static void main(String args[])
    {
        Run mt = new Run();
        Thread t = new Thread(mt);
        t.start();
    }
}

