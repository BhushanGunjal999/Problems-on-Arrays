// WAP to check given array is sorted in acending order or not

class Array20
{
    public static void main(String[] args) 
    {
       int a[] = {1,2,4,8,9,11};

       System.out.println(isSorted(a));
    }

    public static boolean isSorted(int a[]) 
    {
        boolean b = false;

        for (int i = 0; i < a.length-1; i++) 
        {
           if (a[i] > a[i+1]) 
           {
              b = true;
              break; 
           }    
        }
        return !b;
    }
}






