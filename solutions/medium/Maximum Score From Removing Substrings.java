// Title: Maximum Score From Removing Substrings
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-score-from-removing-substrings/

            } else {
                total += secondVal;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == second && ch == first) {
                sb2.deleteCharAt(sb2.length() - 1);
            } else {
                sb.append(ch);
            }
        }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == first && ch == second) {
                sb.deleteCharAt(sb.length() - 1);
                total += firstVal;
        StringBuilder sb = new StringBuilder();
        int total = 0;
        for (char ch : s.toCharArray()) {
                sb2.append(ch);
            }
        }
        return total;
    }
}