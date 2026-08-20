public class MoveZeroes {
    public static void main(String[] args) {
        int []nums = new int [] {0,1,0,3,12};

        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }


//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0){
//                loop: for(int j = i + 1; j < nums.length; j++){
//                    if(nums[j] != 0){
//                        int temp = nums[j];
//                        nums[j] = nums[i];
//                        nums[i] = temp;
//                        break loop;
//                    }
//                }
//            }
//        }

    }
}
