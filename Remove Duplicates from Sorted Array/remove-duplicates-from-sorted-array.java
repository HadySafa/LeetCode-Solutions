class Solution {

    public int removeDuplicates(int[] nums) {

        int uniqueElements = 0;

        int lastUnique = nums[0];
        nums[uniqueElements++] = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != lastUnique){
                lastUnique = nums[i];
                nums[uniqueElements++] = nums[i];
            }
        }

        return uniqueElements;
    }
    
}