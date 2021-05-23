/*************************************************************
 Purpose/Description: A java class to count the occurrences of
 an integer in an array of n integers.
 Author’s Panther ID: 6231951
 Certification:I hereby certify that this work is my own and
 none of it is the work of any other person.
**************************************************************/
class OccurenceCounter
{
 
    // Recursive implementation of binary search
    private static int binarySearch(int arr[], int l,
                            int r, int x)
    {
        if (r < l)
        {
            return -1;
        }
        int mid = l + (r - l) / 2;
 
        // Check if the element is present
        // at the exact middle
        if (arr[mid] == x)
        {
            return mid;
        }
 
        // Check if the element is smaller than
        // than the value of the middle element...
        // and therefore in the left segment of the array.
        if (arr[mid] > x)
        {
            return binarySearch(arr, l, mid - 1, x);
        }
 
        // Otherwise we know that the element is in the right segment.   
        return binarySearch(arr, mid + 1, r, x);
    }
 
    // Returns the number occurrences of some 
    // integer in an array.
    private static int countOccurrences(int arr[], int n, int x)
    {
        int index = binarySearch(arr, 0,
                               n - 1, x);
 
        // Check that the element is present.
        if (ind == -1)
        {
            return 0;
        }
         
        // Count occurences of x on the left side.
        int count = 1;
        int left = ind - 1;
        while (left >= 0 && arr[left] == x)
        {
            count++;
            left--;
        }
 
        // Count occurences of x on right side.
        int right = ind + 1;
        while (right < n &&
               arr[right] == x)
        {
            count++;
            right++;
        }
 
        return count;
    }
 
 
    // Run the function with test data
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 2, 2, 2,
                     3, 4, 7, 8, 8};
        int length = arr.length;
        int target = 2;
        System.out.println(arr, length, target);
    }
}
