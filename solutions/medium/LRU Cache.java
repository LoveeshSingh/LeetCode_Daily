// Title: LRU Cache
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/lru-cache/

·‌·‌·‌·‌node·‌tail;
·‌·‌·‌·‌HashMap<Integer,node>·‌map;
·‌·‌·‌·‌int·‌cnt;
·‌·‌·‌·‌int·‌sz;
·‌·‌·‌·‌public·‌LRUCache(int·‌capacity)·‌{
·‌·‌·‌·‌node(int·‌key·‌,·‌int·‌value·‌,·‌node·‌pre·‌,·‌node·‌post){
·‌·‌·‌·‌·‌·‌·‌·‌this.key=key;
·‌·‌·‌·‌·‌·‌·‌·‌this.value=value;
·‌·‌·‌·‌·‌·‌·‌·‌this.pre·‌=·‌pre;
·‌·‌·‌·‌·‌·‌·‌·‌this.post=post;
·‌·‌·‌·‌}
}

class·‌LRUCache·‌{
·‌·‌·‌·‌node·‌head;
·‌·‌·‌·‌int·‌key;
·‌·‌·‌·‌int·‌value;
·‌·‌·‌·‌node·‌pre;
·‌·‌·‌·‌node·‌post;
·‌·‌·‌·‌void·‌removeNode(){
·‌·‌·‌·‌·‌·‌·‌·‌this.pre.post=this.post;
·‌·‌·‌·‌·‌·‌·‌·‌this.post.pre=this.pre;
·‌·‌·‌·‌}
class·‌node{
