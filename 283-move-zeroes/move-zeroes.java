class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int i =0;i<n;i++){
            if (nums[i]!=0){
                 nums[j++]=nums[i];
            }      
         }

         while(j<n){
            nums[j++]=0;
         }
        }

        
    }

class Answer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        Solution sol = new Solution();
        sol.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}