class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n>=2){
            return fib(n-1)+fib(n-2);
        }
        return 0;
    }
}

class Answer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s = new Solution();
        int r = s.fib(n);
        System.out.println(r);
    }
}
