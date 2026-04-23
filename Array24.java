// InPut  = 32615;
// OutPut = {1,2,3,5,6}
//      n = 12356

import java.util.Arrays;

class Array24
{
    public static void main(String[] args) 
    {
      int n = 32615,temp=n,count=0;

      while (temp!=0) 
      {
         count++;
         temp/=10;   
      }

      int a[] = new int[count];

      while (n!=0) 
      {
         a[--count] = n%10;
         n/=10;   
      }

      Arrays.sort(a);

      System.out.println(Arrays.toString(a));

        int result = 0;

        for (int i = 0; i < a.length; i++) 
        {
            result = result * 10 + a[i];
        }

        System.out.println(result);
    }
}






