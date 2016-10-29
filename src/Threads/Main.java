package Threads;

public class Main {

    public static void main(String[] args) {
        FibonacciTh fib1 = new FibonacciTh(20);
        FibonacciTh fib2 = new FibonacciTh(50);
        Thread fib3 = new Thread(new FibonacciRn(100));
        
        fib1.start();
        fib2.start();
        fib3.start();
    }
    
}
