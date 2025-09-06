// Title: Maximal Rectangle
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/maximal-rectangle/

                if (matrix[i][j]=='1') mat[i][j]=mat[i-1][j]+1;
            }
        }
        int ans=0;
        for (int[] arr : mat) ans=Math.max(ans,histogram(arr));
        return ans;
    }

    public int histogram(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        for (int i=1 ; i<arr.length ; i++){
            int j=i-1;
            while(j>=0){
                if (arr[j]>=arr[i]) j=j-left[j]-1;
                else break;
            }
            left[i]=i-j-1;
        }
        for (int i=arr.length-2 ; i>=0 ; i--){
            int j=i+1;
            while(j<arr.length){
                if (arr[j]>=arr[i]) j+=right[j]+1;
                else break;
            }
            right[i]=j-i-1;
        }
        int ans=0;
