package fundamentals;

class Chicken{
        private int eggNo;

        private boolean eggSetFlag = false;

        public synchronized void setEggNo(int i){
           while(eggSetFlag){ // egg produced but not consumed
               try {
                   wait();
               }catch(Exception e){}
           }
            eggNo = i;  // generate egg by producer
            eggSetFlag = true;
            System.out.println("set egg no = " + eggNo);
            notify(); // must notify to run other thread who waiting.
        }
        public synchronized int getEggNo(){
            while(!eggSetFlag){
                try{
                    wait();
                }catch(Exception e){}
            }
            System.out.println("get egg no = " + eggNo);
            eggSetFlag = false;
//            must notify waiting Thread
            notify(); // must notify other thread to run who waiting.
            return eggNo;
        }
}
class Producer implements Runnable{
      Chicken chick;
      public Producer(Chicken chick){
          this.chick = chick; // common resource
      }
      public void run(){
            int i = 1;
            while(true){ // polling
                chick.setEggNo(i++);
                    try{Thread.sleep(1000);}catch(Exception e){}
            }
      }
}

class Consumer implements Runnable{
    Chicken chick;
    public Consumer(Chicken chick){
        this.chick = chick; // common resource
    }
    public void run(){
        int i;
        while(true){
        i = chick.getEggNo();
        try{Thread.sleep(1000);}catch(Exception e){}
        }

    }
}

// Driver Class
public class ProducerConsumerProblem {
    public static void driver(){
        System.out.println("Producer-Consumer Problem");
        Chicken chick = new Chicken();
        Producer p = new Producer(chick);
        Consumer c = new Consumer(chick);

        Thread t1 = new Thread(p, "Producer Thread");
        Thread t2 = new Thread(c, "Consumer Thread");

        t1.start();
        t2.start();



    }
}