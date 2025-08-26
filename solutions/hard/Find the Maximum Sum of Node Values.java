// Title: Find the Maximum Sum of Node Values
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-maximum-sum-of-node-values/

        for (int i=0 ; i<nums.length-1 ; i+=2){
            if (arr[i]>0){
                if (arr[i+1]>0){
                    ans+=arr[i]+arr[i+1];
                }

            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
                else{
                    if (arr[i]+arr[i+1]>0) ans+=arr[i]+arr[i+1];
                    else break;
                }
            }
            else break;
        }
        return ans;
    }
}  
