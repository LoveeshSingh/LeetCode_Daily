// Title: Avoid Flood in The City
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/avoid-flood-in-the-city/

        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0 ; i<n ; i++){
            ans[i]=1;
            if (rains[i]==0) list.add(i);
            else if (map.containsKey(rains[i])){
                ans[i]=-1;
            }
            else{
                ans[i]=-1;
            }
        }
                int index = Collections.binarySearch(list,map.get(rains[i]));
                if (index<0){
                    index = -index-1;
                }
                ans[list.get(index)] = rains[i];
                list.remove(index);
        return ans;
                if (index>=list.size()) return new int[]{};
    }
        int[] ans = new int[n];
                map.put(rains[i],i);
        int n = rains.length;
                map.put(rains[i],i);
}
