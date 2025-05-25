class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,List<Integer>> map = new HashMap<>();
        for (int i=0 ; i<words.length ; i++){
            String s = words[i];
            String reversed = new StringBuilder(s).reverse().toString();
            if (map.containsKey(s)){
                List<Integer> list = map.get(s);
                list.set(0,list.get(0)+1);
            }
            else if (map.containsKey(reversed)){
                List<Integer> list = map.get(reversed);
                list.set(1,list.get(1)+1);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(0);
                map.put(s,list);
            }
        }
        int ans=0;
        for (String s : map.keySet()){
            List<Integer> list = map.get(s);
            if (s.charAt(0)==s.charAt(1)){
                if (ans/2%2==0){
                    ans+=list.get(0)*2;
                }
                else{
                    ans+=list.get(0)/2*4;
                }
            }
            else{
                ans+=Math.min(list.get(0),list.get(1))*4;
            }
        }
        return ans;
    }
}
