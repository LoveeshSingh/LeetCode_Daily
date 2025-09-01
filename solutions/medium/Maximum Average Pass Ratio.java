// Title: Maximum Average Pass Ratio
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-average-pass-ratio/

class·‌Solution·‌{
·‌·‌·‌·‌public·‌double·‌maxAverageRatio(int[][]·‌classes,·‌int·‌extraStudents)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌PriorityQueue<Pair<Integer,Integer>>·‌pq·‌=·‌new·‌PriorityQueue<>((i,j)->Double.compare(·‌((j.getKey()+1)*1.0/(j.getValue()+1)-(j.getKey()*1.0)/(j.getValue()))·‌,·‌((i.getKey()+1)*1.0/(i.getValue()+1)-(i.getKey()*1.0)/(i.getValue())))·‌);
·‌·‌·‌·‌·‌·‌·‌·‌
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i=0·‌;·‌i<classes.length·‌;·‌i++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌pq.add(new·‌Pair(classes[i][0],classes[i][1]));
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i=0·‌;·‌i<extraStudents·‌;·‌i++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌pq.add(new·‌Pair(pq.peek().getKey()+1,pq.poll().getValue()+1));
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌double·‌ans·‌=·‌0;
·‌·‌·‌·‌·‌·‌·‌·‌int·‌div·‌=·‌0;
·‌·‌·‌·‌·‌·‌·‌·‌while(!pq.isEmpty()){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌ans+=pq.peek().getKey()*1.0/pq.poll().getValue();
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌return·‌ans/classes.length;
·‌·‌·‌·‌}

}
