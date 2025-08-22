// Title: Next Greater Element II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/next-greater-element-ii/

            }
            else ans[i]=stk.peek();
            stk.push(nums[i]);
        }
            // System.out.println(ans[i]);
        for (int i=nums.length-1 ; i>indx ; i--){
            while(!stk.isEmpty()){
                if (stk.peek()<=nums[i]) stk.pop();
                else break;
            }
            if (stk.isEmpty()){
                ans[i]=-1;
            }
            else ans[i]=stk.peek();
            stk.push(nums[i]);
            // System.out.println(ans[i]);
        }
        return ans;
    }
}
