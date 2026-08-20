public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int []nums = new int []{0,0,1,1,1,2,2,3,3,4};

        int pointer_slow = 0;
        int pointer_fast = 0;

        for(int i = pointer_fast; i < nums.length; i++){
            if (nums[i] != nums[pointer_slow]){
                ++pointer_slow;
                nums[pointer_slow] = nums[i];
            }
        }
        System.out.println(pointer_slow + 1);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
