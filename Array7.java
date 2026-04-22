// Write a program to find second max element in the array and also find max element


class Array7
{
    public static void main(String[] args) 
     {

        int a[] = {15,18,19,58,13,20,12,14,21};
      
        int max = a[0];
        int smax = 0;

         for (int i = 1; i < a.length; i++) 
        {
            if (a[i] > max) 
            {
                smax = max;
                max = a[i];  
            }
            else
            {
                if (a[i] > smax  && a[i] != max) 
                {
                   smax = a[i];    
                }

            }
        }

        System.out.println("max num is : "+max);
        System.out.println("second max num is : "+smax);
    }
       
}






