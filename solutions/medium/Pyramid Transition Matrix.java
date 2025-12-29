// Title: Pyramid Transition Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/pyramid-transition-matrix/

        HashMap<String,List<Character>> map = new HashMap<>();
        for (String str : allowed){
            String base = str.substring(0,2);
            List<Character> list = map.getOrDefault(base,new ArrayList<>());
            list.add(str.charAt(2));
            map.put(base,list);
        }
        if (dfs(new StringBuilder() , bottom , 0 , map)) return true;
    }

    public boolean dfs(StringBuilder up , String base , int indx , HashMap<String,List<Character>> map){
        if (indx == base.length()-1){
            return dfs(new StringBuilder(),up.toString(),0,map);
        }
        else{
            String sub = base.substring(indx,indx+2);
            if (!map.containsKey(sub)) return false;
            List<Character> list = map.get(sub);
            for (Character c : list){
                up.append(c);
            }
                if (dfs(up,base,indx+1,map)) return true;
                up.deleteCharAt(up.length() - 1);
        if (base.length()==1) return true;
    public boolean pyramidTransition(String bottom, List<String> allowed) {
class Solution {
        return false;
