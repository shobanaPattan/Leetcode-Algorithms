import java.util.Arrays;

public class BuyOrSellStocks {

    public static int[] maxProfit(int[] prices){

        int[] res = new int[2];

        int profit = 0;
//        int min = Integer.MAX_VALUE;
        int min = prices[0];

        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min= prices[i];
                res[0] = i;
            }

            if(prices[i]-min > profit){
                profit= prices[i]-min;
                res[1] = i;
            }
        }
         return  res;
    }

    public static void main(String[] args){

        int[] profit = {7,1,5,3,6,4};

        System.out.println(Arrays.toString(maxProfit(profit)));
    }

}


//Initialize Integer.Max_Value to a variable and profit=0
//For loop to go through each array elements
//Find the min value in the list using if condition
//Find the max profit and return it