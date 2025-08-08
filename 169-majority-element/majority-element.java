class Solution {
    public int majorityElement(int[] nums) {
        int r =0;
       Map<Integer,Integer> map = new HashMap<>();
       for(int i : nums){
          map.put(i,map.getOrDefault(i,0)+1);
          if(map.get(i)>nums.length/2){
            r = i;
          }
       } 
       return r;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        int n = sc.nextInt();
        int a[] = new int[n];
         System.out.println("enter array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Solution sol = new Solution();
        int r = sol.majorityElement(a);
        System.out.println(r);
    }
}