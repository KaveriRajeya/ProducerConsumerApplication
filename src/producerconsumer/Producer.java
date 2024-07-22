package producerconsumer;

public class Producer implements Runnable {
		
	   private final SharedProduct product;

	    public Producer(SharedProduct product) {
	        this.product = product;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            try {
	                product.produce(i);
	                Thread.sleep(1000); // time taken to produce data
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }
}
