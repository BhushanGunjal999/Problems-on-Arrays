// Write a program to find the avg of even and odd number in the array


class Array5
{
    public static void main(String[] args) 
     {
       int a[] = {5,8,13,4,2,8,16,9};
      int oddSum = 0, evenSum = 0, count = 0;

      for (int i = 0; i < a.length; i++) 
      { 
           int temp = a[i];

           if (temp % 2 != 0) 
           {
              oddSum += temp;
              count++; 
           }
           else
           {
            evenSum += temp;
           }
      }

      double oddAvg = oddSum/(double)count;

      double evenAvg = evenSum/(double)(a.length-count);

      System.out.println(oddAvg);
      System.out.println(evenAvg);

     }
       
}






