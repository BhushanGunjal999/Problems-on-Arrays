// Write a program to find average of array


class Array2
{
    public static void main(String[] args) 
     {

        int a[] = {5,3,8,10,12,15};
      
         int sum = 0;

         for (int i = 0; i < a.length; i++) 
        {
            sum+=a[i];            
        }
        
        double avg = sum / (double)a.length;

        System.out.println("average of array :"+avg);
     }
       
}






