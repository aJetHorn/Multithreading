
package threadpooldemo;

import java.util.concurrent.*;
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        executor.execute(new PrintChar('a', 100));
        executor.execute(new PrintChar('b', 100));
        executor.execute(new PrintChar('c', 100));
        executor.execute(new PrintChar('d', 100));
        executor.execute(new PrintChar('e', 100));
        
        executor.shutdown();
    }
}
