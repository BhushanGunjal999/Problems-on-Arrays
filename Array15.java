// WAP to check a given element exist or not in the array
// By using Binary search

class Array15
{
    public static void main(String[] args) 
    {
        int a[] = {2, 3, 4, 5, 6, 7, 7, 8, 11, 14, 50};    
        int target = 14;

        int index = search(a,target);

        System.out.println(index);
    }

    public static int search (int a[], int target) 
    {
        int start = 0;
        int end = a.length-1;

        while (start <= end) 
        {
            int mid = start + (end - start)/2;

            if (target > a[mid]) 
            {
               start = mid + 1;    
            }
            else if (target < a[mid]) 
            {
               end = mid - 1;    
            }
            else
            {

                return mid;
            }

        }

        return -1;
    }
}