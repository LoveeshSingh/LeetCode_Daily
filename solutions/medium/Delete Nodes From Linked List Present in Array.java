// Title: Delete Nodes From Linked List Present in Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/

 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0 ; i<nums.length ; i++) set.add(nums[i]);
        ListNode ans = head;
        while(head!=null){
            head = head.next;
        }
            if (set.contains(head.val)){
                if (head==ans){
            }
                    ans = head.next;
                }
                else {
        ListNode last = null;
                    last.next = head.next;
                }
    }
            else last = head;
        return ans;
