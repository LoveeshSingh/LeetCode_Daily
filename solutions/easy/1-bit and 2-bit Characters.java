// Title: 1-bit and 2-bit Characters
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/1-bit-and-2-bit-characters/

class·‌Solution·‌{
·‌·‌·‌·‌public·‌boolean·‌isOneBitCharacter(int[]·‌bits)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌boolean[]·‌dp·‌=·‌new·‌boolean[bits.length+1];
·‌·‌·‌·‌·‌·‌·‌·‌dp[0]·‌=·‌true;
·‌·‌·‌·‌·‌·‌·‌·‌if·‌(bits[0]==0)·‌dp[1]=true;
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i=2·‌;·‌i<=bits.length·‌;·‌i++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(dp[i-1]·‌&&·‌bits[i-1]==0)·‌dp[i]=true;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌else·‌if·‌(dp[i-2]·‌&&·‌((bits[i-1]==0·‌&&·‌bits[i-2]==1)·‌||·‌(bits[i-1]==1·‌&&·‌bits[i-2]==1)))·‌dp[i]=true;
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌if·‌(dp[bits.length-1]·‌&&·‌bits[bits.length-1]==0)·‌return·‌true;
·‌·‌·‌·‌·‌·‌·‌·‌return·‌false;
}
