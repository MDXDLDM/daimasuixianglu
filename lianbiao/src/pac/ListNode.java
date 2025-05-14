package pac;

public class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
        next = null;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
