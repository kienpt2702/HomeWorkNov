import java.util.Stack;

public class QueueByStack<E>{
    private Stack<E> inStack;
    private Stack<E> outStack;
    private int size;
    public QueueByStack(){
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    public E enQueue(E item){
        inStack.push(item);
        size++;
        return item;
    }
    public E deQueue() throws Exception {
        if(!outStack.isEmpty()) return outStack.pop();
        // outstack and instack are both empty
        if(inStack.isEmpty()) throw new Exception("Queue is empty");
        while (!inStack.isEmpty()) outStack.push(inStack.pop());
        return outStack.pop();
    }
    public int size(){
        return size;
    }
}
