class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] output = new int[nums.length];
       int left = 0;
       int right = nums.length-1;
       int pos=nums.length-1;
       while(left<=right){
        int leftVal=nums[left]*nums[left];
        int rightVal=nums[right]*nums[right];
        if(leftVal>rightVal){
           output[pos]=leftVal;
           left++;
        }else{
            output[pos]=rightVal;
            right--;
        }
        pos--;
       }
       return output;
    }
}