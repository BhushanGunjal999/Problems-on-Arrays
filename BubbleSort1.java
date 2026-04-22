// Sorting by using BubbleSort in acending order

import java.util.Arrays;

class BubbleSort1
{
    public static void main(String[] args) 
    {
      int a[] = {5,2,3,9,6,7,4};

      for (int i = 1; i < a.length; i++) 
      {
          for (int j = 0; j < a.length - i ; j++) 
          {
             if (a [j] > a[j + 1]) 
             {
                 int temp = a[j];
                 a[j] = a[j + 1];
                 a[j+1] = temp;   
             }  
          }  
      }

      System.out.println(Arrays.toString(a));
    }
}
