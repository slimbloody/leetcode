public class P21_Merge_Two_Sorted_Lists {
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    return sol1(l1, l2);
  }
  
  public ListNode sol1(ListNode l1, ListNode l2) {
    ListNode res = new ListNode();
    ListNode cur = res;
    
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        cur.next = l1;
        l1 = l1.next;
        cur = cur.next;
      }
      else {
        cur.next = l2;
        l2 = l2.next;
        cur = cur.next;
      }
    }
  
    if (l1 != null) {
      cur.next = l1;
    }
  
    if (l2 != null) {
      cur.next = l2;
    }
    
    return res.next;
  }
}




