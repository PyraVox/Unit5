public interface queue{
	public Object peekFront();
	public Object dequeue();
	public void enqueue(Object o);
	public int size();
}