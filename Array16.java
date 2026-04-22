// WAP to check a given element exist or not in the array
// By recursion

class Array16
{
    public static void main(String[] args) 
    {
        int a[] = {2, 3, 4, 5, 6, 7, 8, 9, 11, 14, 50};    
        int target = 7;

        int index = search(a,0,a.length-1,target);

        System.out.println(index);
    }

    public static int search (int a[], int start, int end, int target) 
    {

        if (start > end) 
        {
           return -1;    
        }

        int mid = start + (end - start)/2;

        if (target > a[mid]) 
        {
          return search(a, mid + 1, end, target);    
        }
        else if(target < a[mid])
        {
          return search(a, start, mid - 1, target);
        }
        else
        {
            return mid;
        }
    }
}