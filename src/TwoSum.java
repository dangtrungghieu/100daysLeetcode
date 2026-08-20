public class TwoSum {
    public static void main(String[] args) {
        int []nums = new int []{2,5,5,11};
        int target = 10;
        int []solution = twoSum(nums,target);
        for (int i = 0; i<solution.length; i++){
            System.out.print(solution[i] + " ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{};
    }
}
