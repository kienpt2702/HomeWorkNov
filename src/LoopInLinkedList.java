import java.util.*;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// leetcode
public class LoopInLinkedList {
    public boolean hasCycle(ListNode head) {
        ListNode currentNode = head;
        ArrayList<ListNode> nodes = new ArrayList<>();
        while(currentNode != null){
            if(nodes.contains(currentNode.next)){
                return true;
            }
            nodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
}