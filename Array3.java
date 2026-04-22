// Write a program to find greter element than avg of array


class Array3
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

        for (int i = 0; i < a.length; i++) 
        {
            if(a[i] > avg) 
            {
                 System.out.println(a[i]);    
            }     
        }
     }
       
}






