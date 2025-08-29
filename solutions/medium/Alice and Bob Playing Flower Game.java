// Title: Alice and Bob Playing Flower Game
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/alice-and-bob-playing-flower-game/

class Solution {
    public·‌long·‌flowerGame(int·‌n,·‌int·‌m)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌int·‌evenUp·‌=·‌n/2;
    }
·‌·‌·‌·‌·‌·‌·‌·‌int·‌oddUp·‌=·‌n-evenUp;
·‌·‌·‌·‌·‌·‌·‌·‌int·‌evenDown·‌=·‌m/2;
·‌·‌·‌·‌·‌·‌·‌·‌int·‌oddDown·‌=·‌m-evenDown;
·‌·‌·‌·‌·‌·‌·‌·‌long·‌ans=evenUp;
·‌·‌·‌·‌·‌·‌·‌·‌ans*=oddDown;
·‌·‌·‌·‌·‌·‌·‌·‌ans+=(long)oddUp*evenDown;
·‌·‌·‌·‌·‌·‌·‌·‌return·‌ans;
}
