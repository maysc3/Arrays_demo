public class Main {
    public static void main(String[] args)
    {
        String[] users; // array
        users = new String[10]; // indexed 0-9 // typically just write String[] users = new String[10]
        String[] DOW = {"sun, mon, tue, wed, thu, fri, sat"}; // array literal
        double[] temps = {56, 56, 56, 56, 56, 56, 56}; // parallel array with temps from each day

        for(String u: DOW) { // enhance loop is read only
            System.out.println(u);  // u is the index of the value in the matrix
        }
        for(int d=0; d < DOW.length; d++) // can change value of array with reg for loop
            System.out.println(DOW[d]+ "\t" + temps[d]);
    }
}