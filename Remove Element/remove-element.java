class Solution {
    
    public int removeElement(int[] nums, int val) {

        Queue<Integer> queue = new LinkedList<>();
        int counter = 0;

        // save index where val is located
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val) {
                queue.add(i);
                counter++;
            }
        }

        // shift the above values into their right place
        for(int i = nums.length - counter; i < nums.length; i++){
            if(nums[i] != val){
                nums[queue.poll()] = nums[i];
            }
        }

        return nums.length - counter;

    }
    
}