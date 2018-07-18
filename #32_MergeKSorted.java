/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    class Pair implements Comparable{
        public int key;
        public int value;
        public Pair(int key,int value){
            this.key = key;
            this.value = value;
        }
        public String toString(){
            return key + " " + value;
        }
        public int compareTo(Object c){
            return this.key<((Pair)c).key?-1:1;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)
            pq.add(new Pair(lists[i].val,i));
        }
        ListNode head = new ListNode(0);
        ListNode copy = head;
        while(pq.size()>0){
            Pair cur = pq.poll();
            ListNode temp = new ListNode(cur.key);
            head.next = temp;
            head = head.next;
            
            int index = cur.value;
            lists[index] = lists[index].next;
            
            ListNode node = lists[index];
            
            if(node!=null){
                pq.add(new Pair(node.val,index));
            }
            
        }
        
        return copy.next;
    }
}
