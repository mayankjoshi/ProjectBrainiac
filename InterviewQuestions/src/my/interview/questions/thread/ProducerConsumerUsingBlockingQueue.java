package my.interview.questions.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

	public static <E> void main(String[] args) throws Exception {

		BlockingQueue<Object> queue = new ArrayBlockingQueue<Object>(1024);

		ProducerTest producer = new ProducerTest(queue);
		ConsumerTest consumer = new ConsumerTest(queue);

		new Thread(producer).start();
		new Thread(consumer).start();

		Thread.sleep(4000);
	}

}

class ProducerTest implements Runnable {

	protected BlockingQueue<Object> queue = null;

	public ProducerTest(BlockingQueue<Object> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			queue.put("1");
			Thread.sleep(1000);
			queue.put("2");
			Thread.sleep(1000);
			queue.put("3");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ConsumerTest implements Runnable {

	protected BlockingQueue<Object> queue = null;

	public ConsumerTest(BlockingQueue<Object> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
