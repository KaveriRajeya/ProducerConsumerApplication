package producerconsumer;

public class ProducerConsumerMain {
	 public static void main(String[] args) throws InterruptedException {
	        SharedProduct product = new SharedProduct();

	        Thread producerThread = new Thread(new Producer(product));
	        Thread consumerThread = new Thread(new Consumer(product));

	        producerThread.start();
	        consumerThread.start();

	        producerThread.join();
            consumerThread.join();
	      
	    }
}
