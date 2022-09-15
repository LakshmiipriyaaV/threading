package threading;

public class MaxPrior extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
          
        MaxPrior t1=new MaxPrior();    
        
        t1.setPriority(Thread.MAX_PRIORITY);    
         
        t1.start();    
    }    
} 
