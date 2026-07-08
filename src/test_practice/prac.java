package test_practice;

public class prac {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int m=0;
        int ans=0;
        for(int i=0;i<prices.length;i++){
            m+=prices[i];
        }
        int s=0;
        for(int i=0;i<prices.length-1;i++){
            s+=prices[i];
            for(int j=i;j<prices.length;j++)
            {
                m-=prices[j];
                int k=Math.abs(s-m);
                if(k%2==0){
                    ans++;
                }
                break;
            }
        }
        return ans;
    }
}
