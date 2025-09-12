// Title: Beautiful Towers I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/beautiful-towers-i/

                stk.pop();
            }
            left[i+1]=left[stk.peek().getValue()]+(i-stk.peek().getValue()+1)*((long)heights[i]);
            if (stk.peek().getKey()==heights[i]) stk.pop();
            stk.push(new Pair(heights[i],i+1));
        }

        stk = new Stack<>();
        stk.add(new Pair(0,n));
        long[] right = new long[n+1];
        for (int i=n-1 ; i>=0 ; i--){
            while(stk.peek().getKey()>heights[i]){
                stk.pop();
            }
            right[i]=right[stk.peek().getValue()]+(stk.peek().getValue()-i)*((long)heights[i]);
            if (stk.peek().getKey()==heights[i]) stk.pop();
            stk.push(new Pair(heights[i],i));
        }
        long max=0;
            while(stk.peek().getKey()>heights[i]){
        long[] left = new long[n+1];
        for (int i=0 ; i<n ; i++){
        Stack<Pair<Integer,Integer>> stk = new Stack<>();
        stk.add(new Pair(0,0));
        for (int i=0 ; i<n ; i++) max = Math.max(max,left[i+1]+right[i]-heights[i]);
        return max;
    }
