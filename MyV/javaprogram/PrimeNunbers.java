package MyV.javaprogram;

public class PrimeNunbers
{
   public static void main(String[] args) 
   {
     int num=5;
     int count=0;

     for(int i=0;i<=num;i++)
     {
        if(num%i==0)
        count++;
     }
     if(count==2)
    {
        System.out.println(num+ "  is prime number");
    }
    else
    {
        System.out.println(num+ "  is not prime number");
    }
   }
}