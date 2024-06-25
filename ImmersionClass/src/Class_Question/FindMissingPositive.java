package Class_Question;

public class FindMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
    }
    public static int firstMissingPositive(int[] nums) {
        boolean f = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >nums.length || nums[i] <=0){
                nums[i] = 1;
            }
            else if(nums[i] == 1){
                f = true;
            }
        }
        if(!f){
            return 1;
        }
        for(int in = 0;in<nums.length;in++){
            int i = Math.abs(nums[in])-1;
            if(nums[i] > 0){
                nums[i] *= -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] >0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
