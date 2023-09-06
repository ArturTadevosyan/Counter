public class Counter {
    private boolean isActive = true;

    public synchronized void count(String name) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6 && isActive) {
                System.out.println("-------------------------");
                isActive = false;
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (i == 10 && !isActive) {
                notifyAll();
            }

            System.out.println(name + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
