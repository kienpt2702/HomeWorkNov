import java.util.LinkedList;

public class QueueByLinkedList<E> {
    private LinkedList<E> linkedList;
    private int size;
    public QueueByLinkedList(){
        linkedList = new LinkedList();
    }
    public E enQueue(E item){
        size++;
        linkedList.addLast(item);
        return item;
    }
    public E deQueue() throws Exception {
        if(size == 0) throw new Exception("Queue is empty");
        size--;
        return linkedList.removeFirst();
    }
    public int size(){
        return size;
    }
}
