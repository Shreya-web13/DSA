class Solution {
    //Best Time to Buy and Sell Stock
    public int maxProfit(int[] p) {
        int minProfit = p[0];
        int maxprofit = 0;

        for(int i=1;i<p.length;i++){
            if(p[i]<minProfit){
                minProfit=p[i];
            }else{
                int profit = p[i]-minProfit;
                if (profit > maxprofit) {
                    maxprofit = profit; // Update max profit
                }
            }
        }

        return maxprofit;
    }
}
class Answer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }

        Solution op = new Solution();
        int result = op.maxProfit(p);
        System.out.println(result);
    }
}