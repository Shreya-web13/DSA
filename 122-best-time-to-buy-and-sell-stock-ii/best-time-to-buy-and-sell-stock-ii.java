class Solution {
    public int maxProfit(int[] p) {
       int profit =0;
       for(int i=1;i<p.length;i++){
        if(p[i]>p[i-1]){
            profit+=(p[i]-p[i-1]);
        }
       } 
       return profit;
    }
}
class Answer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i =0;i<n;i++){
            p[i]=sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.maxProfit(p);
        System.out.println(result);
    }
}