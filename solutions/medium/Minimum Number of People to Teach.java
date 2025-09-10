// Title: Minimum Number of People to Teach
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-number-of-people-to-teach/

·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(!flag){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌needsTeaching[friend[0]-1]=true;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌needsTeaching[friend[1]-1]=true;
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i=0·‌;·‌i<needsTeaching.length·‌;·‌i++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(needsTeaching[i]){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌lang·‌:·‌languages[i]){
·‌·‌·‌·‌·‌·‌·‌·‌int·‌max=0;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌langs[lang]++;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(langs[lang]>max){
·‌·‌·‌·‌·‌·‌·‌·‌int·‌cnt=0;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌cnt++;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌HashSet<Integer>·‌set·‌=·‌new·‌HashSet<>();
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌lang·‌:·‌languages[friend[0]-1])·‌set.add(lang);
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌boolean·‌flag·‌=·‌false;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌lang·‌:·‌languages[friend[1]-1]){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(set.contains(lang)){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌flag=true;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌break;
class·‌Solution·‌{
·‌·‌·‌·‌public·‌int·‌minimumTeachings(int·‌n,·‌int[][]·‌languages,·‌int[][]·‌friendships)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌int[]·‌langs·‌=·‌new·‌int[n+1];
·‌·‌·‌·‌·‌·‌·‌·‌boolean[]·‌needsTeaching·‌=·‌new·‌boolean[languages.length];
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int[]·‌friend·‌:·‌friendships){
