public class Main {
/*    Challenge
    Create a function that given an array of integer numbers and an integer target, returns the indexes of the two numbers such that they add up to the target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
            Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]

    Explanation
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
    Example 4:
    Input: nums = [3,3,5,7,5], target = 8
    Output: [0,2]*/


    public int[] getTarget(int[] nums, int target ) {
        int[] solution = new int[2];
        for(int x = 0 ; x<nums.length;x++){
            for(int j = x+1 ; j<nums.length;j++){
                if(x!=j){
                    if(nums[x]+nums[j]==target){
                        solution[0]=x;
                        solution[1]=j;
                        //Collectiomn.positionOf(target-x);
                        return solution;
                    }
                }
            }
        }
        return solution;
    }

}
