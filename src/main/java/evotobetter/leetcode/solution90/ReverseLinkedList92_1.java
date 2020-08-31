package evotobetter.leetcode.solution90;

import evotobetter.leetcode.util.ListNode;

public class ReverseLinkedList92_1 implements ReverseLinkedList92 {
    @Override
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode start=head;
        ListNode prev=head;
        int pos=1;
        for( ;pos<m;pos++){
            prev=start;
            start=start.next;
        }
        ListNode reverseEnd=start;
        ListNode current=start;
        ListNode next=current.next;
        for(;pos<n;pos++ ){
            ListNode nextTmp=next.next;
            next.next=current;
            current=next;
            next=nextTmp;
        }
        ListNode reverseHead=current;
        ListNode reverseNextEnd=next;
        if(reverseEnd!=head){
            prev.next=reverseHead;
        }else{
            head=reverseHead;
        }
        reverseEnd.next=reverseNextEnd;
        return head;
    }

}
