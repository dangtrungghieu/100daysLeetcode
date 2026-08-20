import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int []nums = new int []{0,2};
        double max = nums[0];
        double tongTemp = 0;
        int missNumber;
        for(int i = 0 ; i < nums.length ; i++){
            tongTemp += (double) nums[i];
            if(nums[i] > max){
                max = nums[i];
            }
        }
        if (max == nums.length - 1){
            missNumber = (int) max + 1;
        }else {
            missNumber = (int)((max + 1) / 2 * max - tongTemp);
        }
        System.out.println(missNumber);
    }
}
