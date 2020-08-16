package evotobetter.leetcode.test.solution80;

import evotobetter.leetcode.test.util.ListNode;

public class DeleteDuplicates83_1 implements DeleteDuplicates83 {
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode current=head.next;
        while(current!=null){
            if(current.val==prev.val){
                prev.next=current.next;
                ListNode tmp=current.next;
                current.next=null;
                current=tmp;
            }else{
                prev=current;
                current=current.next;
            }

        }
        return head;
    }
}
