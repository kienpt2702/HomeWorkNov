import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PrintLinkedList {
    public ListNode reverseList(ListNode head, int index) {
        int count = 0;
        ListNode ans = null;
        ListNode currentNode = head;
        while(currentNodee != null){
            if(count == index){
                ans = currentNode;
                break;
            }
            count++;
            currentNode = currentNode.next;
        }
        // if index > size -> null, else ans will be currentNode
        return ans;
    }
}