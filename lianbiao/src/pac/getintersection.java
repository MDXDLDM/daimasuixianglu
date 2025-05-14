package pac;

public class getintersection {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode currA = headA;
        ListNode currB = headB;
        while (currA != null) {
            lengthA++;
            currA = currA.next;
        }
        while (currB != null) {
            lengthB++;
            currB = currB.next;
        }
        int diff;
        if (lengthA > lengthB) {
            currA = headA;
            currB = headB;
            diff= lengthA - lengthB;
        }
        else{
            currA = headB;
            currB = headA;
            diff= lengthB - lengthA;
        }
        while(diff>0){
            currA = currA.next;
            diff--;
        }
        while(currA!=null){
            if(currA==currB){
                return currA;
            }
            else{
                currA = currA.next;
                currB = currB.next;
            }
        }
        return null;
    }
}
