package test;

public class Cruiser implements Runnable {
    
    public void run() {
        System.out.print("go");
    }
    
    public static void main(String arg[]) throws InterruptedException {
        Thread t = new Thread(new Cruiser());
        t.run();
        t.run();
        t.start();
       Thread.sleep(10);
    }
}