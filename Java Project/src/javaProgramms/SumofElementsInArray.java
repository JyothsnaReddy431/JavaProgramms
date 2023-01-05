package javaProgramms;

public class SumofElementsInArray {
	
	 static int a[]= {1,2,3,4,5,6,7,8,9,10};
	//static int arr[] = { 12, 3, 4, 15 };
	 
    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0; // initialize sum
        int i;
 
        // Iterate through all elements and add them to sum
        for (i = 0; i < a.length; i++)
            sum += a[i];
 
        return sum;
    }
 
    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                           + sum());
    }
}
