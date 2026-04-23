// WAP to check given array is sorted in decending order or not

class Array21
{
    public static void main(String[] args) 
    {
       int a[] = {9,8,7,6,5,4,3};

       System.out.println(isSorted(a));
    }

    public static boolean isSorted(int a[]) 
    {
        boolean b = false;

        for (int i = 0; i < a.length-1; i++) 
        {
           if (a[i] < a[i+1]) 
           {
              b = true;
              break; 
           }    
        }
        return !b;
    }
}






