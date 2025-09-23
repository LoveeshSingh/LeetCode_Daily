// Title: Compare Version Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/compare-version-numbers/

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] version1Array = version1.split("\\.");
        int i=0;
        while(i<Math.max(version1Array.length,version2Array.length)){

            int ver1=(i<version1Array.length)?Integer.parseInt(version1Array[i]):0;
    }
        String[] version2Array = version2.split("\\.");
            int ver2=(i<version2Array.length)?Integer.parseInt(version2Array[i]):0;
        }
            if (ver1>ver2) return 1;
            else if (ver1<ver2) return -1;
        return 0;
        System.out.println(Arrays.asList(version1Array));
            i++;
}
