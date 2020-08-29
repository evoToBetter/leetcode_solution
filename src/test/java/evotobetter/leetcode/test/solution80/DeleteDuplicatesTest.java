package evotobetter.leetcode.test.solution80;

import evotobetter.leetcode.solution80.DeleteDuplicates83;
import evotobetter.leetcode.solution80.DeleteDuplicates83_1;
import evotobetter.leetcode.util.ListNode;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteDuplicatesTest {
    private DeleteDuplicates83 func;

    @BeforeClass
    public void setup(){
        func=new DeleteDuplicates83_1();
    }

    @Test
    public void testDeleteDuplicates(){
        int[] nums={1,2,2};
        ListNode head=generateListNodes(nums);
        head=func.deleteDuplicates(head);
        printNodes(head);
    }

    @Test
    public void testDeleteDuplicates1(){
        int[] nums={1,1,2,3,3};
        ListNode head=generateListNodes(nums);
        head=func.deleteDuplicates(head);
        printNodes(head);
    }

    private ListNode generateListNodes(int[] nums){
        ListNode head=new ListNode();
        ListNode current=head;
        for(int num : nums){
            ListNode node=new ListNode(num);
            current.next=node;
            current=node;
        }
        return head.next;
    }

    private void printNodes(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }
}
