import java.util.*;
public class Prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number ");
        n=sc.nextInt();
        Prime obj=new Prime();
        if (obj.isprime(n)==1)
        System.out.println(n + " is prime");
        else
         System.out.println(n + " is not prime");
    }
    int  isprime(int n)
    {
        int i;
        boolean flag=true;
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
              flag=false;
              break;
            }
        }
        if(flag)
            return 1;
        else
            return 0;
    }
}
