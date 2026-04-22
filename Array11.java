// WAP to swap first and last withhout using third variable

import java.util.Arrays;

class Array11
{
    public static void main(String[] args) 
    {
       int a[] = {10,20,30,40,50};

       a[0] = a[0] + a[a.length-1];
       a[a.length-1] = a[0] - a[a.length-1];
       a[0] = a[0] - a[a.length-1];

        System.out.println(Arrays.toString(a));
    }
       
}






