// Title: Sort an Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-an-array/

        return nums;
    }

    public int[] merge(int[] nums , int start , int mid ,int end){
        int[] left = Arrays.copyOfRange(nums,start,mid+1);
        int[] right = Arrays.copyOfRange(nums,mid+1,end+1);
        int i=0;
        int j=0;
        int ptr=start;
        while(i<left.length && j<right.length){
            if (left[i]<=right[j]){
                nums[ptr++]=left[i++];
            }
            else{
                nums[ptr++]=right[j++];
            }
        }
        while(i<left.length) nums[ptr++]=left[i++];
        while(j<right.length) nums[ptr++]=right[j++];
    }
        return nums;
}