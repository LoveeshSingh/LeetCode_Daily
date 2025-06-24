// Title: Count Vowel Strings in Ranges
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-vowel-strings-in-ranges/

            if (start=='a' || start=='e' || start=='i' || start=='o' || start=='u'){
        }
            char end = words[i].charAt(words[i].length()-1);
                if (end=='a' || end=='e' || end=='i' || end=='o' || end=='u'){
            }
                    diff[i+1]=diff[i]+1;
                }
        for (int i=0 ; i<queries.length ; i++){
            ans[i]=diff[queries[i][1]+1]-diff[queries[i][0]];
        }
        int[] ans = new int[queries.length];
        return ans;
            else{
                diff[i+1]=diff[i];
            }
                else{
                    diff[i+1]=diff[i];
                }
    }
}