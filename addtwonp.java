public class addtwonp {

    class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}

    class solution {
    
        public ListNode addtwonp(ListNode l1 , ListNode l2){

            int carry = 0;
            ListNode dummy = new ListNode(0);
            ListNode currrent = dummy;
        
            while (l1 != null || l2!= null || carry !=0) {
                int sum = carry;

                if (l1!=null) {
                    sum = sum+ l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum = sum + l2.val;
                    l2 = l2.next;
                }
            
                carry = sum/10;
                 currrent.next = new ListNode(sum%10);
                 currrent = currrent.next;
            
            
            
            }

        
        
        

        return dummy.next;
        
    }

}
}