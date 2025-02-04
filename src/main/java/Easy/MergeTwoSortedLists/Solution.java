package Easy.MergeTwoSortedLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // La lista ordenada final debe de tener la misma capacidad de la list1.val + list2. val , si la lista 1 tiene 3 nodos y la lista 2 4 nodos
        // eso nos daría que la lista final debe tener un total de capacidad de 7 nodos
        ListNode finalList = new ListNode(list1.val + list2.val);



        return null;
    }
}