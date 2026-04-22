// Sorting by using Exchange sort in decending order

import java.util.Arrays;

class ExchangeSort2
{
    public static void main(String[] args) 
    {
      int a[] = {2,1,4,6,5,8,7,9};
      
      for (int i = 0; i < a.length-1; i++) 
      {
         for (int j = i+1; j < a.length; j++) 
         {
           if (a[i] < a[j]) 
           {
              int temp = a[i];
              a[i] = a[j];
              a[j] = temp;
           }   
         }  
         
      }
       System.out.println(Arrays.toString(a));
      
    }
}