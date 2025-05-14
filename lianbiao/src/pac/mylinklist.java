package pac;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

public class mylinklist {
    private ListNode head;
    private int length;
    mylinklist(){
        head = null;
        length = 0;
    }
    public int getindex(int n){
        if(n>length-1||n<0)return -1;
        else{
            ListNode temp = head;
            while(n>0){
                temp=temp.next;
                n--;
            }
            return temp.val;
        }
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if(length==0){
            head = newNode;
        }
        else{
            ListNode temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index>length||index<0) {}
        else{
            if(index==0){
                addAtHead(val);
            }
            else if(index==length){
                addAtTail(val);
            }
            else{
                ListNode newNode = new ListNode(val);
                ListNode temp = head;
                while(index>1){
                    temp=temp.next;
                    index--;
                }
                newNode.next=temp.next;
                temp.next=newNode;
                length++;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (index>length-1||index<0) {}
        else if(index==0){
            head=head.next;
            length--;
        }
        else{
            ListNode temp = head;
            while(index>1){
                temp=temp.next;
                index--;
            }
            temp.next=temp.next.next;
            length--;
        }
    }

}
