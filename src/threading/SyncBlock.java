package threading;

class Testsmple{
void printTestsmple(int n)
{

synchronized(this)
{
System.out.println("The output of synchronized block is: ");
for( int i=1 ; i<=4 ; i++ )
{
System.out.println(n*i);

try
{
Thread.sleep(500);
}
catch(Exception exc)
{
System.out.println(exc) ;
}
}
}
} 
}
class T1 extends Thread
{
Testsmple t;
T1(Testsmple t)
{
this.t=t;
}
public void run()
{
t.printTestsmple(10);
}
}
class T2 extends Thread
{
Testsmple t;
T2(Testsmple t)
{
this.t=t;
}
public void run()
{
t.printTestsmple(200);
}
}
public class SyncBlock
{
public static void main(String args[])
{

Testsmple ob = new Testsmple();

T1 t1=new T1(ob);
T2 t2=new T2(ob);

t1.start();
t2.start();
}  }