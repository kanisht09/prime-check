import java.util.*;
class Sieve
{
    public static void main(String args[])
    {
        boolean sieve[] = new boolean[100001];
        sieve[0] = true;
        sieve[1] = true;
        for(int i=2;(i*i)<=100000;i++)
        {
            if(!sieve[i])
            {
                for(int j=2*i;j<=100000;j+=i)
                {
                    sieve[j] = true;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(!sieve[n])
        {
            System.out.println("It is a prime no.");
        }
        else
        {
          System.out.println("It is not a prime no.");
        }
    }
}