package threading;

public class MinPrior extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
          
        MaxPrior t1=new MaxPrior();    
        
        t1.setPriority(Thread.MIN_PRIORITY);    
         
        t1.start();    
    }    
} 

