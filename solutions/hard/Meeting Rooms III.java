// Title: Meeting Rooms III
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/meeting-rooms-iii/

            if (!unusedRooms.isEmpty()) {
                int room = unusedRooms.poll();
                usedRooms.offer(new long[]{end, room});
                meetingCount[room]++;

                int room = (int) usedRooms.poll()[1];
                unusedRooms.offer(room);
            }
            int start = meeting[0], end = meeting[1];

            while (!usedRooms.isEmpty() && usedRooms.peek()[0] <= start) {
        for (int i = 0; i < n; i++) {
            unusedRooms.offer(i);
        }

        Arrays.sort(meetings, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        for (int[] meeting : meetings) {
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        var meetingCount = new int[n];
        var usedRooms = new PriorityQueue<long[]>((a, b) -> a[0] != b[0] ? Long.compare(a[0], b[0]) : Long.compare(a[1], b[1]));
        var unusedRooms = new PriorityQueue<Integer>();
