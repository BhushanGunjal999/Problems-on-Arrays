// Sorting by using Selection sort in decending order

import java.util.Arrays;

class SelectionSort2
{
    public static void main(String[] args) 
    {
      int a[] = {5,2,3,9,6,7,4};

      for (int i = 0; i < a.length-1; i++) 
      {
          int small = i;

          for (int j = i+1; j < a.length; j++) 
          {
             if (a [small] < a[j]) 
             {
                 small = j;
             }  
          }  
             int temp = a[i];
             a[i] = a[small];
             a[small] = temp;
      }

      System.out.println(Arrays.toString(a));
    }
}
