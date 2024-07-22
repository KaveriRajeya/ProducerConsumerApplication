package producerconsumer;

public class Consumer implements Runnable {
	  private final SharedProduct product;

	    public Consumer(SharedProduct product) {
	        this.product = product;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            try {
	                product.consume();
	                Thread.sleep(2000); //  time taken to consume data
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }
}
