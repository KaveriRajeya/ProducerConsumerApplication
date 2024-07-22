package producerconsumer;

public class SharedProduct {
	 private int data;
	    private boolean available = false;

	    public synchronized void produce(int value) throws InterruptedException {
	        while (available) {
	            wait(); // Waiting until the data is consumed
	        }
	        data = value;
	        available = true;
	        System.out.println("Produced: " + data);
	        notifyAll(); // Notify consumer threads that data is available
	    }

	    public synchronized int consume() throws InterruptedException {
	        while (!available) {
	            wait(); // Wait until the data is produced
	        }
	        available = false;
	        System.out.println("Consumed: " + data);
	        notifyAll(); // Notify producer threads that data has been consumed
	        return data;
	    }
}
