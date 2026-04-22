// WAP to find sum of three elements in given array

class Array19
{
    public static void main(String[] args) 
    {
      int a[] = {1,19,14,2,7,15,12,18,13,10};

      int key = 32;

      for (int i = 0; i < a.length-2; i++) 
      {
         for (int j = i + 1; j < a.length-1; j++)
         {
            for (int k = j + 1; k < a.length; k++) 
            {
                if (a[i]+ a[j] + a[k] == key) 
                {
                    System.out.println(a[i] + "\t" + a[j] + "\t" + a[k]);
                }
            } 
         }  
      }
    }
}






