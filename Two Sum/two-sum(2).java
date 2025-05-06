import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
                int difference = target - nums[i];
                if(values.containsKey(nums[i])){ 
                    int [] answer = {i,values.get(nums[i])};
                    return answer;
                }
                values.put(difference,i);
        }

        return nums;

    }
}