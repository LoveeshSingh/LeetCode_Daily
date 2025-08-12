// Title: Ways to Express an Integer as Sum of Powers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/ways-to-express-an-integer-as-sum-of-powers/

        }
            }
        return (int)dp[power.length-1][n];
            for (int j=0 ; j<=n ; j++){
        dp[0][power[0]]=1;
        for (int i=1 ; i<power.length ; i++){
        for (int i=0 ; i<power.length ; i++) dp[i][0]=1;
        }
        long[][] dp = new long[power.length][n+1];
            
        // for (int i=0 ; i<power.length ; i++){
        //     for (int j=0 ; j<=n ; j++){
        // }
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
                dp[i][j]=(dp[i-1][j]+((j-power[i]<0)?0:dp[i-1][j-power[i]]))%mod;

            power[i]=(int)Math.pow(i+1,x);
        for(int i=0 ; i<power.length ; i++){
    }
}

        int[] power = new int[(int)Math.pow(n,1.0/x)+1];
    public int numberOfWays(int n, int x) {