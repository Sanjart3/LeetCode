package arrays;

public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        int val1, val2, sum;
        ListNode nextNode = new ListNode(0);
        ListNode result = nextNode;
        int remainder = 0;

        while (l1!=null||l2!=null||remainder!=0){

            if (l1==null){
                val1 = 0;
            } else{
                val1 = l1.val;
                l1 = l1.next;
            }

            if (l2 == null){
                val2 = 0;
            } else{
                val2 = l2.val;
                l2 = l2.next;
            }

            sum = val1+val2+remainder;
            remainder = sum>=10?1:0;

            nextNode.next = new ListNode(sum%10);
            nextNode = nextNode.next;

        }
        result = result.next;
        nextNode.next=null;
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
