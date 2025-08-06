class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int s = m+n;
       int[] merged = new int[s];

       System.arraycopy(nums1,0,merged,0,m);
       System.arraycopy(nums2,0,merged,m,n);

        Arrays.sort(merged);

         
        for (int i = 0; i < s; i++) {
            nums1[i] = merged[i];

       }
    }
}
class Answer{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num1 = new int[n];
        for(int i =0;i<n;i++){
            num1[i]=sc.nextInt();
        }
        int[] num2 = new int[n];
        for(int i=0;i<n;i++){
            num2[i]=sc.nextInt();
        }

        int len1 = sc.nextInt();
        int len2 = sc.nextInt();

        Solution sol = new Solution();
        sol.merge(num1, len1, num2, len2);

        System.out.println(Arrays.toString(num1));

    }
}
