// WAP to check given array is sorted in decending order or not by using recurtion

class Array23
{
    public static void main(String[] args) 
    {
       int a[] = {9,8,7,6,5,4,3};

       System.out.println(isSorted(a,0));
    }

    public static boolean isSorted(int a[],int index) 
    {
       if (index == a.length-1) 
      {
         return true;    
      }

      return a[index] >= a[index+1] && isSorted(a, index+1);
    }
}






