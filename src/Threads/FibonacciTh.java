package Threads;

public class FibonacciTh extends Thread {
    private int a = 1;
    private int b = 1;
    private int r;
    private int limit;
    
    public FibonacciTh(int limit){
        this.limit = limit;
    }
    
    public void run(){
        for(int i = 0; i < limit; i++){
            r = a + b;
            System.out.print(r + " ");
            a = b;
            b = r;
        }
    }
}
