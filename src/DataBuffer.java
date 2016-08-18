
public class DataBuffer {
	private int dataBuffer[];
	private int capacity;
	
	private int front = 0;
	private int currentSize = 0;
	
	public DataBuffer(int capacity) {
		this.capacity = capacity;
		dataBuffer = new int[capacity];
	}
	
	private boolean isEmpty() {
		return (currentSize == 0);
	}
	
	private boolean isFull() {
		return (currentSize == capacity);
	}
	
	public synchronized void produce(int data, String producerName) {
		while(isFull()) {
			try {
				wait();
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
		
		dataBuffer[(front + currentSize) % capacity] = data;
		System.out.println("Data " + data + " produced by " + producerName);
		currentSize++;
		notifyAll();
		
		Integer aInteger =new Integer(4);
	}
}
