// Title: Fruit Into Baskets
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/fruit-into-baskets/

                if (map.get(fruits[i])==1) map.remove(fruits[i]);
                else map.put(fruits[i],map.get(fruits[i])-1);
                i++;
            while (map.size()>2){
            }
        for (int j=0 ; j<fruits.length ; j++){
        int ans=0;
        int i=0;
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
class Solution {
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}