public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread("T1", counter);
        counterThread1.start();
        CounterThread counterThread2 = new CounterThread("T2", counter);
        counterThread2.start();
    }
}
