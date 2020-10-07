package evotobetter.leetcode.solution90;

public class UniqueBinarySearchTrees96_1 implements UniqueBinarySearchTress96 {
    @Override
    public int numTrees(int n) {
        if(n<3){
            return n;
        }
        if(n==3){
            return 5;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=5;
        for(int i=4; i<=n;i++){
            if(i%2==0){
                for(int j=1;j<=i/2;j++){
                    dp[i]+=dp[i-j]*dp[j-1]*2;
                }
            }else{
                for(int j=1;j<=i/2;j++){
                    dp[i]+=dp[i-j]*dp[j-1]*2;
                }
                dp[i]+=dp[i/2]*dp[i/2];
            }
        }
        return dp[n];
    }
}
