// Title: Find Minimum Time to Reach Last Room II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-minimum-time-to-reach-last-room-ii/

        Queue<Pair> pq = new PriorityQueue<>((i,j)->Integer.compare(i.dst,j.dst));
        }
        dst[0][0]=0;
        pq.add(new Pair(0,0,0));
        while(!pq.isEmpty()){
            int i=pq.peek().i;
            int j=pq.poll().j;
            for (int[] dir : dirs){
                int ni=i+dir[0];
                int nj=j+dir[1];
                if(ni<0 || nj<0 || ni>=n || nj>=m) continue;
                int time=Math.max(dst[i][j],move[ni][nj]);
                time+=(i+j&1)+1;
                if (time<dst[ni][nj]){
                    dst[ni][nj]=time;
                    pq.add(new Pair(time,ni,nj));
                }
                if (ni==n-1 && nj==m-1) return dst[ni][nj];
            }
        }
        return -1;
    }
}
