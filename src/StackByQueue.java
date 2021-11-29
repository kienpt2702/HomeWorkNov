
public class StackByQueue<E>{
    private QueueByLinkedList<E> queue1;
    private QueueByLinkedList<E> queue2;
    private int size;
    public StackByQueue(){
        queue1 = new QueueByLinkedList<>();
        queue2 = new QueueByLinkedList<>();
    }
    public E push(E item){
        queue1.enQueue(item);
        size++;
        return item;
    }
    public E pop() throws Exception {
        if (size == 0) throw new Exception("Stack is empty");
        int count = size--;
        while(count > 1){
            queue2.enQueue(queue1.deQueue());
            count--;
        }
        // swap to make sure the main queue is always queue1 -> dont need to put all items again
        QueueByLinkedList<E> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return queue2.deQueue();
    }
}
