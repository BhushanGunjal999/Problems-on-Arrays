// WAP to check a given element exist or not in the array
// By using linear search

class Array14
{
    public static void main(String[] args) 
    {
        int a[] = {8,8,2,5,4,11,14,50,3,7,6};    
        int target = 50;

        int index = search(a,target);

        System.out.println(index);
    }

    public static int search (int a[], int target) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == target) 
            {
               return i;    
            }
             
        }
        return -1;
    }
}