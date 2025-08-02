// Title: Rearranging Fruits
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/rearranging-fruits/

        for (int val : map1.keySet()){
        List<Integer> b2= new ArrayList<>();
        }
        List<Integer> b1= new ArrayList<>();
            }
            else map2.put(basket2[i],map2.getOrDefault(basket2[i],0)+1);
                    map1.put(basket2[i],map1.get(basket2[i])-1);
                }
                    map1.remove(basket2[i]);
                }
                else{
            min=Math.min(min,basket2[i]);
            if (map1.containsKey(basket2[i])){
                if (map1.get(basket2[i])==1){
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i=0 ; i<basket2.length ; i++){
        for (int i=0 ; i<basket1.length ; i++){
            min=Math.min(min,basket1[i]);
            map1.put(basket1[i],map1.getOrDefault(basket1[i],0)+1);
        }
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        int min=Integer.MAX_VALUE;
            if (map1.get(val)%2==1) return -1;
            for (int i=0 ; i<map1.get(val)/2 ; i++){