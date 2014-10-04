
package threaddemo;

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable printC = new PrintChar('c', 100);
        Runnable printD = new PrintChar('d', 100);
        
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printC);
        Thread thread4 = new Thread(printD);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
    }
}
