import java.util.ArrayList;
public class LinkedPriorityQueue implements PriorityQueue {
    
    private ArrayList[] list;
   
    public LinkedPriorityQueue(int size) {
	list = new ArrayList[size];
	for (int x=0; x<list.length; x++) {
	    list[x] = new ArrayList();
	}
	
    }
    public void enqueue(Object obj, int priority) {
	list[priority].add(obj);
    }
    public Object peekFront() {
	for (int x=0; x<list.length; x++) {
	    if (!list[x].isEmpty()) {
		return list[x].get(0);
	    }
	}
	return null;
    }
    public Object dequeue() {
	for (int x=0; x<list.length; x++) {
	    if (!list[x].isEmpty()) {
		return list[x].remove(0);
	    }
	}
	return null;
    }
    public void enqueue(Object o) {
	throw new IllegalStateException("Must supply a priority");
    }
    public int size() {
	return list.length;
    }
    
}