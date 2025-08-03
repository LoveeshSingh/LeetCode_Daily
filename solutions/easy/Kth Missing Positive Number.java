// Title: Kth Missing Positive Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/kth-missing-positive-number/

    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end+1)/2;
        }
            int cnt = arr[mid]-mid-1;
        int val=0;
            if (k>cnt){
                start=mid;
            }
            else{
                end=mid-1;
            }
        if (k>arr[arr.length-1]-arr.length){
            return k+arr.length;
        }
    }
        return arr[start]+(k-(arr[start]-start-1));
class Solution {
        if(k<arr[0]) return k;
}