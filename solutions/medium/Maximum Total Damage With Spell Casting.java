// Title: Maximum Total Damage With Spell Casting
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-total-damage-with-spell-casting/

        HashMap<Integer,Long> map = new HashMap<>();
        for (int i=0 ; i<power.length ; i++){
            map.put(power[i],map.getOrDefault(power[i],(long)0)+power[i]);
        }
        int[] arr = new int[map.size()];
        int indx=0;
        for (int val : map.keySet()) arr[indx++]=val;
        return dp[arr.length-1];
        Arrays.sort(arr);
        for(int i=1 ; i<arr.length ; i++){
            int val = arr[i]-3;
        }
            for (int j=i-1 ; j>=0 ; j--){
                if (arr[j]<=val){
            }
                    break;
                }
    }
                    dp[i]+=dp[j];
        long[] dp = new long[arr.length];
            dp[i]=map.get(arr[i]);
            dp[i]=Math.max(dp[i],dp[i-1]);
        dp[0]=map.get(arr[0]);
}
    public long maximumTotalDamage(int[] power) {
class Solution {
