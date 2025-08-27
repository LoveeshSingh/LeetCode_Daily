// Title: Remove K Digits
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/remove-k-digits/

        }
                if (top<=num.charAt(i)){
            }
                }
                    break;
            stk.push(num.charAt(i));
                else{
                    k--;
                }
        StringBuilder str = new StringBuilder();
        while(!stk.isEmpty()){
            if (stk.isEmpty() && num.charAt(i)=='0') continue;
            if (k-->0) stk.pop();
                    stk.push(top);
        }
        return str.reverse().toString();
            
    }
                char top = stk.pop();
        if (str.length()==0) return "0";
            else str.append(stk.pop()); 
}
