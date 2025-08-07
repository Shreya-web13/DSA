class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] leftsum = new int[n];
         int[] rightsum = new int[n];

        for(int i=1;i<n;i++){
            leftsum[i] = leftsum[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rightsum[i] = rightsum[i+1]+nums[i+1];
        }

        for(int i=0;i<n;i++){
            if(leftsum[i]==rightsum[i]){
            return i;
            }
        }
        
        return -1;
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
            int result = s.pivotIndex(num);
            System.out.println(result);
    }
}