// Title: Find First and Last Position of Element in Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

                start=mid+1;
            }
        }
        int foundRight=-1;
        start=0;
        end=nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                foundRight=mid;
                start=mid+1;
            }
            else if (nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{foundLeft,foundRight};
    }
}