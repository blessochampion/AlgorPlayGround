/**
https://leetcode.com/problems/two-sum/description/
*/
class LeetCode1 {
    public  int[] twoSum(int[] nums, int target) {
        //result array
        int[] result;
        //let there be a map the keeps track of a no and it's index
        Map<Integer, Integer> numberIndexMap = new HashMap<>();
        // the compliment of a no is target-theNumber
        int numberCompliment, theNumber;
        for(int i=0; i< nums.length; i++){
            numberCompliment = target - nums[i];
            if(numberIndexMap.containsKey(numberCompliment)){
                return new int[]{numberIndexMap.get(numberCompliment), i};
            }else{
                numberIndexMap.put(nums[i], i);
            }
        }
        return null;
    }
}
