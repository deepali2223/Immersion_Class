package Extra_Question;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int st = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int curSum = 0;
        int curLen = 0;
        while(end<nums.length){
            curSum += nums[end];
            while(curSum >= target) {
                curLen = end - st + 1;
                minLen = Math.min(minLen,curLen);
                curSum -= nums[st];
                st++;
            }
            end++;
        }
        return minLen == Integer.MAX_VALUE?0:minLen;
    }
}
