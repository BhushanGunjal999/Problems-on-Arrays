// Write a program to find the avg of odd number in the array


class Array4
{
    public static void main(String[] args) 
     {

        int a[] = {5,3,8,10,12,15};
      
         int sum = 0;
         int count = 0;

         for (int i = 0; i < a.length; i++) 
        {
            int temp = a[i];

            if (temp%2 != 0) 
            {
              sum+= temp;
              count++;   
            }

        }
        
        double avg = sum / (double)count;

        System.out.println(avg);

     }
       
}






