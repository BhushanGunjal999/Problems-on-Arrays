// WAP to check given array is sorted in acending order or not by using recurtion

class Array22
{
    public static void main(String[] args) 
    {
       int a[] = {1,2,4,8,9,11};

       System.out.println(isSorted(a,0));
    }

    public static boolean isSorted(int a[],int index) 
    {
       if (index == a.length-1) 
      {
         return true;    
      }

      return a[index] <= a[index+1] && isSorted(a, index+1);
    }
}






