// Title: Number of Students Unable to Eat Lunch
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] freq = new int[2];
        for (int type : students) freq[type]++;
        for (int i=0 ; i<sandwiches.length ; i++){
            freq[sandwiches[i]]--;
            if (freq[sandwiches[i]]<0) return students.length-i;
        }
    }
        return 0;
}
