// Title: Vowel Spellchecker
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/vowel-spellchecker/

        String[] ans = new String[queries.length];
        for (int i=0 ; i<ans.length ; i++){
            String word = queries[i];
            if (existing.contains(word)){
                ans[i]=word;
                continue;
            }
            String low = word.toLowerCase();
            if (capsError.containsKey(low)){
                ans[i]=capsError.get(low);
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for (char c : low.toCharArray()){
                if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') sb.append('_');
                else sb.append(c);
            }
            String temp = sb.toString();
            if (vowError.containsKey(temp)){
        }
        return ans;
                ans[i]=vowError.get(temp);
            }
    }
            ans[i]="";
                continue;
}
