class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
             nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }

}
class Answer{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i]=sc.nextInt();
            }

            Solution s = new Solution();
            int[] result = s.runningSum(num);
            System.out.println(Arrays.toString(result));
    }
}