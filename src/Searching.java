import java.util.Random;

import java.util.Scanner;

public class Searching
{
    static Random gen = new Random();
    final static int SIZE =15;
    final static int DATA_RANGE =101;
    static int[] data;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        data = new int[SIZE]; // 0 -100
        setData();
        showData();

        boolean found = false;
        int target = SafeInput.getRangedInt(in, "Enter the target", 0, 100);
        for (int d = 0; d < data.length; d++) {
            if (data[d] == target) {
                System.out.println("Found target (" + target + ") at locus " + d);
                found = true;
            }
            if (!found) {
                System.out.println("Did not find target " + target);
            }
        }

        int lastTarget = SafeInput.getRangedInt(in, "Enter the target", 0, 100);
        int foundLocus = -1;
        for (int d = 0; d < data.length; d++)
        {
            if (data[d] == lastTarget) {
                foundLocus = d;
                System.out.println("Found target (" + lastTarget + ") at locus " + d);
            }
            if (foundLocus == -1) {
                System.out.println("Did not find target " + lastTarget);
            }
        }
    }
        private static void setData () {
            for (int d = 0; d < data.length; d++)
                data[d] = gen.nextInt(DATA_RANGE);
            System.out.println();
        }
        private static void showData () {
            for (int d = 0; d < data.length; d++)
                System.out.print(data[d] + " | ");
            System.out.println();
        }

}
