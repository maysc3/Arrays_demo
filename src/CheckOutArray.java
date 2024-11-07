import java.util.Scanner;
public class CheckOutArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double[] itemPrices = new double[100];
        double itemPrice = 0;
        int itemCount = 0;
        double totalPrice = 0;
        double average = 0;


        double maxVal;
        double minVal;
        int maxDex;
        int minDex;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in,"Enter the item price",.5,10.00);
            itemPrices[itemCount] = itemPrice;
            itemCount++;
            totalPrice += itemPrice;
            done = SafeInput.getYNConfirm(in,"Are you done");
        }while(!done);
        average = totalPrice/itemCount;

        maxVal= minVal = itemPrices[0];
        maxDex = minDex = 0;
        for(int d =1; d < itemCount; d++)
        {
            if(itemPrices[d] > maxVal){
                maxVal = itemPrices[d];
                maxDex = d;
            }
            if(itemPrices[d] < minVal){
                minVal = itemPrices[d];
                minDex = d;
            }

        }
        for(int d =0; d < itemCount; d++) // need reg for bc array is sparse
            System.out.printf("%8.2f\n", itemPrices[d]);
        System.out.println("The total is " + totalPrice + " the average price is " + String.format("%10.2f",average));
        System.out.println("The max val is " + maxVal);
        System.out.println("The min val is " + minVal);

    }
}
