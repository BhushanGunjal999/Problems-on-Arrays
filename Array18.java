// WAP to find sum of two elements in given array

class Array18
{
    public static void main(String[] args) 
    {
      int a[] = {1,19,14,2,7,15,12,18,13,10};

      int key = 30;

      for (int i = 0; i < a.length; i++) 
      {
         for (int j = i + 1; j < a.length; j++)
         {
            if (a[i] + a[j] == key) 
            {
               System.out.println(a[i] + "\t" + a[j]);    
            }    
         }  
      }
    }
}






