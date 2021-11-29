import java.util.LinkedList;

public class StackByLinkedList<E>{
    private LinkedList<E> linkedList;
    private int size;
    public StackByLinkedList(){
        linkedList = new LinkedList<>();
    }
    public E push(E item){
        linkedList.addLast(item);
        size++;
        return item;
    }
    public E pop() throws Exception {
        if(size == 0) throw new Exception("BUSU");
        size--;
        return linkedList.removeLast();
    }
    public int size(){
        return linkedList.size();
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
