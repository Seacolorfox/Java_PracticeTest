class MyThread implements Runnable
{
    private int ticket = 10;
//    private String name;
//    public MyThread(String name)
//    {
//        this.name = name;
//    }
    @Override
    public void run() {

        while (true)
        {
            synchronized (this)
            {
                if(ticket>0)
                {

                    System.out.println(Thread.currentThread().getName()+" SALE:"+ticket--);
                }
            }
                 try {
                     Thread.sleep(100);
                  }catch (InterruptedException e)  //不能加至同步中 否则线程会抱锁睡眠 使得其他线程无法进入
                  {
                     e.printStackTrace();
                  }
        }
    }//Thread.currentThread()

}
public class ThreadTicket
{
    public static void main(String args[])
    {
        MyThread myThread = new MyThread();
//        MyThread myThread = new MyThread("B");
//        MyThread myThread = new MyThread("C");
        Thread t1 = new Thread(myThread,"A");
        Thread t2 = new Thread(myThread,"B");
        Thread t3 = new Thread(myThread,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}