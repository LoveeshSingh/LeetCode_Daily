// Title: Meeting Rooms III
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/meeting-rooms-iii/

            while(pq.peek().busyTill<start){
                Pair pair = pq.poll();
            }
                pair.busyTill = start;
                pq.add(pair);
            Pair pair = pq.poll();
            int room = pair.room;
            pair.busyTill = Math.max(pair.busyTill+end-start,end);
            freq[room]++;
            pq.add(pair);
        }

        int max = 0;
        int ans=0; 
        for (int i=0 ; i<n ; i++){
            if (freq[i]>max){
                ans = i;
                max = freq[i];
            }
        }
        return ans;
    }
}
