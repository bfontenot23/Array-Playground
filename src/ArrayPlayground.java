import java.util.Scanner;
public class ArrayPlayground {

    public static void main(String[] args) {
        int numsArray[] = {0,1,2,3,4,5,6,7,8,9};
        Scanner numScan = new Scanner(System.in);
        int index, value;
        System.out.println("[*]Enter an index, followed by a number to modify the array at that location or a non-number to end");
        printArray(numsArray);
        while(numScan.hasNextInt()) {
            index = numScan.nextInt();
            if(numScan.hasNextInt()) {
                value = numScan.nextInt();

                System.out.printf("[*]Attempting to set index %d to value %d\n",index,value);
                modifyArray(numsArray,index,value);
                printArray(numsArray);
            }

        }

        System.out.println("[*]Non-int found! Ending program shortly...");
        printArray(numsArray);
        //Don't forget any final stuff!
        numScan.close();
    }

    /*
     * modifyArray - modifies an array, returning true if the modification was successful or false if unsuccessful
     * @param arr - an integer array to be modified
     * @param index - integer value representing the index in the array that will be modified
     * @param mod - integer value that will be inputted into the array at the specified index
     * @return - true or false based on whether the modification was made successfully
     */
    public static boolean modifyArray(int[] arr, int index, int mod) {
        try{
            arr[index] = mod;
            return true;
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("[!]Error setting value! Check your index!");
            return false;
        }
    }


    /*
     * printArray - Prints the inputted integer array.
     * @param arr - an integer array to be printed
     */
    public static void printArray(int[] arr) {
        System.out.print("[*]The array currently is: [");

        for(int i = 0 ; i<arr.length ; i++)
        {
            if(!(i==arr.length-1)) System.out.printf("%d, ",arr[i]);
            else System.out.printf("%d",arr[i]);
        }

        System.out.println("]");
    }

}
