package main.arrayExample;

public class StockBuyProfitNaive {

    public static void main(String[] args) {
        int[] arr = {1,5,3,8,12};
        System.out.println(getMaxProfit(arr, 0, arr.length-1));
    }

    public static int getMaxProfit(int[] arr, int start, int end) {
        int profit =0;
        if(start >= end)
            return 0;
        for(int i=start; i<end; i++) {
            for(int j= i+1; j<=end; j++) {
                if(arr[j] > arr[i]) {
                    int curr_Profit = arr[j] - arr[i] + getMaxProfit(arr, start, i-1) + getMaxProfit(arr,j+1, end);
                    profit = Math.max(profit, curr_Profit);
                }
            }
        }
        return profit;
    }
}
