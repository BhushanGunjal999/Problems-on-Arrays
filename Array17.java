// WAP to reverse array  without using third variable

import java.util.Arrays;

class Array17
{
    public static void main(String[] args) 
    {
      int a[] = {10,20,30,40,50,60,70,80};    

      for (int i = 0; i < a.length/2; i++) 
      {
         a[i] += a[a.length-1-i];
         a[a.length-1-i] = a[i] - a[a.length-1-i];
         a[i] -= a[a.length-1-i];    
      }

      System.out.println(Arrays.toString(a));
    }
}






