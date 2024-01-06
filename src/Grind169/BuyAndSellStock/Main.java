package Grind169.BuyAndSellStock;

public class Main {
    public static void main(String[] args) {
        int[] values={7,1,5,3,6,4};
        System.out.println(profit(values));

    }

    public static int profit(int[] values){
        int buy_value=Integer.MAX_VALUE;
        int profit=0;

        for(int i=0; i<values.length; i++){
            if (values[i]<buy_value) {
                buy_value=values[i];
            }
            else {
                if (profit<values[i]-buy_value){
                    profit=values[i]-buy_value;
                }
            }
        }

        return profit;
    }
}
